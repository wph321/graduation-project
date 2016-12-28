package com.struts.action;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.springframework.web.context.request.SessionScope;

import com.biz.dao.AllZipDao;
import com.hibernate.entity.Article;
import com.hibernate.entity.BlogUser;
import com.hibernate.entity.Say;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

public class showAction extends ActionSupport {

	
//	ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
//	AllZipDao allZipDao = (AllZipDao) ac.getBean("AllZipDao");
	private AllZipDao allZipDao;
	

	public AllZipDao getAllZipDao() {
		return allZipDao;
	}

	public void setAllZipDao(AllZipDao allZipDao) {
		this.allZipDao = allZipDao;
	}
	
	
	public String showIndex(){
		
		ActionContext ac = ActionContext.getContext();
		Map session = ac.getSession();
		try {
			BlogUser bu1 = (BlogUser) session.get("user");
			Map<String, List> allMap = allZipDao.findAlltable(bu1.getUserId());
			if(allMap!=null){
			List<BlogUser> buList = new ArrayList<BlogUser>();
			buList.add(bu1);
			List<Say> sayList = allMap.get("say");
			List<Article> arList = allMap.get("article");
			session.put("user1", buList);
			session.put("say", sayList);
			session.put("article", arList);
//			System.out.println(userList.get(0).getUserName());
//			System.out.println(sayList.get(0).getSContext());
//			System.out.println(arList.get(0).getAContext());
			return SUCCESS;
			}else{
				return ERROR;
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return ERROR;
		}
	}
	
}
