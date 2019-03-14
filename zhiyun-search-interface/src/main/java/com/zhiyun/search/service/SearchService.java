package com.zhiyun.search.service;

import java.util.List;
import java.util.Map;

import com.zhiyun.pojo.KlType;

/**
 * 搜索的服务层
 * @author guoshuai
 *
 */
public interface SearchService {
	
	/**
	 * 搜索的方法
	 * @param map
	 */
	public Map search(Map searchMap);
	
	

	
	/**
	 * 查找所有的分类
	 * @return
	 */
	public List<KlType> findAllType();
	
}
