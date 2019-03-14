package com.zhiyun.user.service.impl;

import java.util.List;
import java.util.Map;

import javax.jms.Destination;
import javax.jms.JMSException;
import javax.jms.MapMessage;
import javax.jms.Message;
import javax.jms.Session;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.jms.core.MessageCreator;

import com.alibaba.dubbo.config.annotation.Service;
import com.zhiyun.mapper.KnowledgeMapper;
import com.zhiyun.mapper.UserMapper;
import com.zhiyun.pojo.Knowledge;
import com.zhiyun.pojo.KnowledgeExample;
import com.zhiyun.pojo.User;
import com.zhiyun.pojo.UserExample;
import com.zhiyun.pojo.UserExample.Criteria;
import com.zhiyun.user.service.UserService;

/**
 * 用户服务类
 * @author guoshuai
 *
 */
@Service
public class UserServiceImpl implements UserService{
	
	@Autowired
	private UserMapper userMapper;
	
	@Autowired
	private RedisTemplate redisTemplate;
	
	@Autowired
	private KnowledgeMapper knowledgeMapper;

	/**
	 * 根据手机号获取用户信息
	 */
	@Override
	public User getUserInfo(String userName) {
		UserExample example = new UserExample();
		Criteria criteria = example.createCriteria();
		criteria.andUserPhoneEqualTo(userName);
		User user = userMapper.selectByExample(example).get(0);
		String userOnlyId = (String)redisTemplate.boundValueOps("userOnlyId_"+user.getUserPhone()).get();
		//先判断缓存中是否有值
		if (userOnlyId==null) {
			//缓存user的onlyid
			redisTemplate.boundValueOps("userOnlyId_"+user.getUserPhone()).set(user.getUserOnlyid());
		}
		
		return user;
	}

	
	@Autowired
	private JmsTemplate jmsTemplate;
	
	
	
	@Autowired
	private Destination smsDestination;
	
	/**
	 * 发送短信
	 */
	@Override
	public void sendSms(final String phoneNum) {
		
		final String smsCode = (long)(Math.random()*1000000)+"";
		System.out.println("验证码："+smsCode);
		System.out.println("手机号："+phoneNum);
		
		//将验证码放入redis中
		redisTemplate.boundHashOps("smscode").put(phoneNum, smsCode);
		
		jmsTemplate.send(smsDestination, new MessageCreator() {
			
			@Override
			public Message createMessage(Session session) throws JMSException {
				// TODO Auto-generated method stub
				MapMessage message = session.createMapMessage();
				message.setString("mobile", phoneNum);
				message.setString("param", smsCode);
				return message;
			}
		});

		
		
	}

	/**
	 * 用户注册请求
	 */
	@Override
	public boolean registerReq(User user,String sms) {
		if (checkCode(user.getUserPhone(), sms)) {
			String id = (long)(Math.random()*10000000)+"";
			user.setUserRemark(0);
			user.setNickname("用户_"+id);
			user.setUserOnlyid(id);
			userMapper.insert(user);
			return true;
		}
		return false;
		
	}
	
	
	/**
	 * 检查短信验证码
	 * @param sms
	 * @return
	 */
	public boolean checkCode(String phoneNum,String sms) {
		String sysSmsSode = (String)redisTemplate.boundHashOps("smscode").get(phoneNum);
		if (sysSmsSode==null) {
			return false;
		}
		if (!sms.equals(sysSmsSode)) {
			return false;
		}
		return true;
	}

	
	/**
	 * 根据useronly获取用户的知识点
	 */
	@Override
	public List<Knowledge> findKlsByUser(String phone) {
	   //获取根据电话的用户的useronlyid
	   String userOnlyId = (String)redisTemplate.boundValueOps("userOnlyId_"+phone).get();
		if (userOnlyId!=null) {
			//根据userOnly查询知识点
		    KnowledgeExample example = new KnowledgeExample();
		    com.zhiyun.pojo.KnowledgeExample.Criteria criteria = example.createCriteria();
		    criteria.andUserOnlyIdEqualTo(userOnlyId);
		    return knowledgeMapper.selectByExampleWithBLOBs(example);
		}
		System.out.println("获取失败知识点列表！");
		return null;
	}

	
	
	/**
	 * 修改知识点状态
	 */
	@Override
	public int updateKlStatus(Map info) {
		Knowledge knowledge = new Knowledge();
		knowledge.setId((int)info.get("klId"));
		knowledge.setIsshared((int)info.get("status"));
		return knowledgeMapper.updateByPrimaryKeySelective(knowledge);
	}

	/**
	 * 删除知识点
	 */
	@Override
	public int deleteKl(int id) {
		int delete = knowledgeMapper.deleteByPrimaryKey(id);
		return delete;
	}

	
	/**
	 * 更新用户信息
	 */
	@Override
	public int updateInfo(User user) {
		
		return userMapper.updateByPrimaryKeySelective(user);
	}

}
