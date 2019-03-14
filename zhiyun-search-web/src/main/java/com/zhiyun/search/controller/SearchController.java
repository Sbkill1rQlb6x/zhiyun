package com.zhiyun.search.controller;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.alibaba.dubbo.config.annotation.Reference;
import com.zhiyun.pojo.KlType;
import com.zhiyun.search.service.SearchService;

@Controller
@RequestMapping("/kwSearch")
public class SearchController {

	@Reference
	private SearchService searchService;
	
	/**
	 * 搜索
	 * @param searchMap
	 * @return
	 */
	@RequestMapping("/search")
	@ResponseBody
	public Map search(@RequestBody Map searchMap) {
		//System.out.println("searchMap:"+searchMap.get("keywords"));
		return searchService.search(searchMap);
	}
	
	/**
	 * 返回页面
	 */
	@RequestMapping("/index")
	public String searchPage(Model model) {
		List<KlType> findAllTypes = searchService.findAllType();
		model.addAttribute("klTypes", findAllTypes);
		return "search";
	}
}
