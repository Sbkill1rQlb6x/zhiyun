package cn.zhiyun.solr;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.data.solr.core.SolrTemplate;
import org.springframework.stereotype.Component;
import com.zhiyun.mapper.KnowledgeMapper;
import com.zhiyun.pojo.Knowledge;
import com.zhiyun.pojo.KnowledgeExample;

@Component
public class SolrUtil {

	@Autowired
	private KnowledgeMapper knowledgeMapper;
	
	@Autowired
	private SolrTemplate solrTemplate;
	
	
	public void importItemData() {
		KnowledgeExample example = new KnowledgeExample();
		com.zhiyun.pojo.KnowledgeExample.Criteria criteria = example.createCriteria();
		criteria.andKlRemarkEqualTo(0);//需要审核通过才导入
		 List<Knowledge> knowledges  = knowledgeMapper.selectByExampleWithBLOBs(example);
		 
		 System.out.println("---知识列表---");
		 for(Knowledge item:knowledges) {
			 System.out.println(item.getKlTitle()+" "+item.getKlAuthor());
			
		 }
		 
		 
		 
		 solrTemplate.saveBeans(knowledges);
		 solrTemplate.commit();
		 
		 System.out.println("---结束---");
	}
	
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("classpath*:spring/applicationContext*.xml");//这种写法会导入其他jar中的配置文件
		SolrUtil solrUtil = (SolrUtil)context.getBean("solrUtil");
		solrUtil.importItemData();
	}
}
