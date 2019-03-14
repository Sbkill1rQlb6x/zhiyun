package com.zhiyun.user.service;

import java.util.List;
import java.util.Map;

import com.zhiyun.pojo.Knowledge;
import com.zhiyun.pojo.User;

/**
 * 用户接口
 * @author guoshuai
 *
 */
public interface UserService {
	
	//获取用户信息
	public User getUserInfo(String userName);
	
	//发送短信验证码
	public void sendSms(String phoneNum);
	
	//用户注册
	public boolean registerReq(User user,String sms);
	
	//获取用户的知识点
	public List<Knowledge> findKlsByUser(String phone);
	
	//修改知识点的状态
	public int updateKlStatus(Map info);
	
	//删除知识点
	public int deleteKl(int id);
	
	//更新用户信息
	public int updateInfo(User user);
	

}
