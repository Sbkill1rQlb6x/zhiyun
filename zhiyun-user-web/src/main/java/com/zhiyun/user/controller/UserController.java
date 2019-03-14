package com.zhiyun.user.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import com.alibaba.dubbo.config.annotation.Reference;
import com.alibaba.fastjson.JSONObject;
import com.zhiyun.pojo.Knowledge;
import com.zhiyun.pojo.User;
import com.zhiyun.user.service.UserService;

/**
 * 用户中心的控制类
 * @author guoshuai
 *
 */
@Controller
@RequestMapping("/user")
public class UserController {
	
	@Reference
	private UserService userService;
	
	/**
	 * 返回用户知识点管理
	 * @return
	 */
	@RequestMapping("/kls")
	public String userKls() {
		return "klManagement";
	}
	
	
	/**
	 * 获取用户信息
	 * @return
	 */
	@RequestMapping("/getUserInfo")
	@ResponseBody
	public Map getUserName() {
		Map map = new HashMap();
		String username = SecurityContextHolder.getContext().getAuthentication().getName();
		User userInfo = userService.getUserInfo(username);
		map.put("userInfo", userInfo);
		return map;
	}
	
	/**
	 * 注册页面
	 * @return
	 */
	@RequestMapping("/register")
	public String register() {
		return "register";
	}
	
	
	/**
	 * 发送短信验证码
	 * @param phoneNum
	 * @return
	 */
	@RequestMapping("/sendSms")
	@ResponseBody
	public void sendSms(@RequestBody Map phone) {
		String phoneNum = (String)phone.get("phone");
		userService.sendSms(phoneNum);
	}
	
	@RequestMapping("/registerReq")
	public String registerReq(User user,String sms) {
		if (userService.registerReq(user, sms)) {
			return "redirect:/login/cas.do";
		}
		return "redirect:/user/register.do";
	}
	
	
	/**
	 * 根据phone获取用户的所有知识点
	 * @param phone
	 * @return
	 */
	@RequestMapping("/getUserKls")
	@ResponseBody
	public Map getUserKls(String phone) {
		Map map = new HashMap<>();
		List<Knowledge> userKls = userService.findKlsByUser(phone);
		map.put("userKls", userKls);
		return map;
		
	}
	
	
	/**
	 * 修改知识点的状态
	 * @param info
	 * @return
	 */
	@RequestMapping("/updateKlStatus")
	@ResponseBody
	public Map updateKlStatus(@RequestBody Map info) {
		Map resMap = new HashMap<>();
		if (userService.updateKlStatus(info)>0) {
			resMap.put("res", true);
			return resMap;
		}
		resMap.put("res", false);
		return resMap;
	}
	
	
	/**
	 * 根据id删除知识点
	 * @param klId
	 * @return
	 */
	@RequestMapping("/deleteKl")
	@ResponseBody
	public Map deleteKl(int klId) {
		Map map = new HashMap<>();
		if (userService.deleteKl(klId)>0) {
			map.put("res", true);
			return map;
		}
		map.put("res", false);
		return map;
	}
	
	
	/**
	 * 用户的个人中心
	 * @param phone
	 * @param model
	 * @return
	 */
	@RequestMapping("/userInfo")
	public String userInfo(String phone,Model model) {
		User userInfo = userService.getUserInfo(phone);
		model.addAttribute("user", userInfo);
		return "person";
	}
	
	
	
	@RequestMapping("/updateInfoReq")
	@ResponseBody
	public Map updateInfoReq(MultipartFile file) {
		return null;
	}
	
	

}
