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
		//��ȡsession
				ActionContext ac = ActionContext.getContext();
				Map session = ac.getSession();
				try {
					
					//�û���Ϣ
					UserMessage um = allZipDao.findUserMessageByUserId(id);
					Map<String, List> allMap = allZipDao.findAlltable(id);
					if(allMap!=null){
					
						List<Say> sayList = allMap.get("say");//��ȡ˵˵����
						List<Article> arList = allMap.get("article");//��ȡ���¼���
						
						//arList����ʱ������
						SortClass sort = new SortClass();//���ϱȽ�����com.struts.action.SortClass
						Collections.sort(arList,sort);
						Collections.reverse(arList);
						//������session��
						session.put("friendusermessage", um);
						session.put("friendsay", sayList);
						session.put("friendarticle", arList);
	//					System.out.println(userList.get(0).getUserName());
	//					System.out.println(sayList.get(0).getSContext());
	//					System.out.println(arList.get(0).getAContext());
						return SUCCESS;//��ȷ����
					}else{
						return ERROR;//mapΪ�շ���
					}
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
					return ERROR;//�������󷵻�
				}
			}
	
}
