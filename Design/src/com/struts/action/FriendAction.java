package com.struts.action;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;

import com.biz.dao.AllZipDao;
import com.biz.dao.ConCernZipDao;
import com.hibernate.entity.Article;
import com.hibernate.entity.BlogUser;
import com.hibernate.entity.Concern;
import com.hibernate.entity.Say;
import com.hibernate.entity.UserMessage;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.struts.bean.SortClass;

public class FriendAction extends ActionSupport {

	
	private AllZipDao allZipDao;
	private Integer id;
	private ConCernZipDao czd;
	
	public AllZipDao getAllZipDao() {
		return allZipDao;
	}
	public void setAllZipDao(AllZipDao allZipDao) {
		this.allZipDao = allZipDao;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public ConCernZipDao getCzd() {
		return czd;
	}
	public void setCzd(ConCernZipDao czd) {
		this.czd = czd;
	}
	public String showFriendIndex(){
		//获取session
				ActionContext ac = ActionContext.getContext();
				Map session = ac.getSession();
				try {
					
					//用户信息
					UserMessage um = allZipDao.findUserMessageByUserId(id);
					Map<String, List> allMap = allZipDao.findAlltable(id);
					if(allMap!=null){
					
						List<Say> sayList = allMap.get("say");//获取说说集合
						List<Article> arList = allMap.get("article");//获取文章集合
						
						//arList按照时间排序
						SortClass sort = new SortClass();//集合比较器类com.struts.action.SortClass
						Collections.sort(arList,sort);
						Collections.reverse(arList);
						//保存在session中
						session.put("friendusermessage", um);
						session.put("friendsay", sayList);
						session.put("friendarticle", arList);
	//					System.out.println(userList.get(0).getUserName());
	//					System.out.println(sayList.get(0).getSContext());
	//					System.out.println(arList.get(0).getAContext());
						return SUCCESS;//正确返回
					}else{
						return ERROR;//map为空返回
					}
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
					return ERROR;//方法错误返回
				}
			}
	
}
