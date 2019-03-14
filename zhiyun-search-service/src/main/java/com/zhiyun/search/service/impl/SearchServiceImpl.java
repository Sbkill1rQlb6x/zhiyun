package com.zhiyun.search.service.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.solr.core.SolrTemplate;
import org.springframework.data.solr.core.query.Criteria;
import org.springframework.data.solr.core.query.HighlightOptions;
import org.springframework.data.solr.core.query.HighlightQuery;
import org.springframework.data.solr.core.query.SimpleHighlightQuery;
import org.springframework.data.solr.core.query.result.HighlightEntry;
import org.springframework.data.solr.core.query.result.HighlightEntry.Highlight;
import org.springframework.data.solr.core.query.result.HighlightPage;

import com.alibaba.dubbo.config.annotation.Service;
import com.fasterxml.jackson.databind.ser.BeanPropertyWriter;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.zhiyun.mapper.KlTypeMapper;
import com.zhiyun.mapper.KnowledgeMapper;
import com.zhiyun.pojo.KlType;
import com.zhiyun.pojo.Knowledge;
import com.zhiyun.pojo.KnowledgeExample;
import com.zhiyun.search.service.SearchService;

@Service(timeout = 6000)
public class SearchServiceImpl implements SearchService {

	@Autowired
	private SolrTemplate solrTemplate;

	@Autowired
	private KlTypeMapper klTypeMapper;
	
	@Autowired
	private KnowledgeMapper knowledgeMapper;

	@Override
	public Map search(Map searchMap) {

		Map map = new HashMap<>();
		
		String keywords = (String)searchMap.get("keywords");
		searchMap.put("keywords", keywords.replace(" ", ""));//关键字去掉空格
		
		
		if (!"".equals(searchMap.get("keywords"))) {
			map.putAll(searchList(searchMap));
			return map;
		}
		
		map.putAll(klTypeSearch((int)searchMap.get("pageNo"),(int)searchMap.get("pageSize"),(int)searchMap.get("type")));
		

		return map;
	}

	/**
	 * 返回高亮列表
	 * 
	 * @param searchMap
	 * @return
	 */
	public Map searchList(Map searchMap) {
		Map map = new HashMap<>();
		// 高亮显示
		HighlightQuery query = new SimpleHighlightQuery();
		// 高亮选项对象，在哪添加高亮
		HighlightOptions highlightOptions = new HighlightOptions().addField("kw_title");
		// 前缀
		highlightOptions.setSimplePrefix("<em style='color:red'>");
		// 设置后缀
		highlightOptions.setSimplePostfix("</em>");
		// 为查询对象设置高亮显示
		query.setHighlightOptions(highlightOptions);

		// 关键字查询
		Criteria criteria = new Criteria("kw_title").is(searchMap.get("keywords"));
		query.addCriteria(criteria);
		
		
		
		//分页处理
	    Integer pageNo = (Integer) searchMap.get("pageNo");//获取当前页
	    if (pageNo==null) {
	    	pageNo=1;
		}
	    Integer pageSize = (Integer) searchMap.get("pageSize");//获取当前页
	    if (pageSize==null) {
			pageSize=20;
		}
	    query.setOffset((pageNo-1)*pageSize);//其实索引 需要计算  （当前页-1)*每一页大小
	    query.setRows(pageSize);//每页大小
		
	    

		// 高亮页对象
		HighlightPage<Knowledge> queryForHighlightPage = solrTemplate.queryForHighlightPage(query, Knowledge.class);
		// 高亮入口集合（每条记录的高亮入口）
		List<HighlightEntry<Knowledge>> entryList = queryForHighlightPage.getHighlighted();

		for (HighlightEntry<Knowledge> entry : entryList) {
			Knowledge knowledge = entry.getEntity();
			// 获取高亮的列表
			List<Highlight> highlightList = entry.getHighlights();
			// System.out.println(highlightList.size());
			if (highlightList.size() > 0 && highlightList.get(0).getSnipplets().size() > 0) {

				knowledge.setKlTitle(highlightList.get(0).getSnipplets().get(0));
			}
		}

		map.put("kws", queryForHighlightPage.getContent());
		map.put("totalPages", queryForHighlightPage.getTotalPages());//搜索到的总页数
		map.put("total", queryForHighlightPage.getTotalElements());//搜索到的总记录数
		return map;
	}
	
	
	/**
	 * 分类查询的方法（java。。。全部。。。）
	 * @param pageNo
	 * @param pageSize
	 * @param type
	 * @return
	 */
	public Map klTypeSearch(int pageNo,int pageSize,int type) {
		Map map = new HashMap<>();
		List<Knowledge> knowledges;
		KnowledgeExample example = new KnowledgeExample();
		com.zhiyun.pojo.KnowledgeExample.Criteria criteria = example.createCriteria();
		criteria.andKlTypeEqualTo(type);
		PageHelper.startPage(pageNo, pageSize);
		if (type==0) {
			knowledges = knowledgeMapper.selectByExampleWithBLOBs(null);
		}else{
			knowledges = knowledgeMapper.selectByExampleWithBLOBs(example);
		}
		PageInfo<Knowledge> resKws = new PageInfo<>(knowledges);
		map.put("kws", resKws.getList());
		map.put("totalPages",resKws.getPages());//搜索到的总页数
		map.put("total", resKws.getTotal());//搜索到的总记录数
		return map;
		
	}
	

	/**
	 * 返回所有类型的类型
	 */
	@Override
	public List<KlType> findAllType() {

		return klTypeMapper.selectByExample(null);
	}

}
