package com.struts.action;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;

import com.biz.dao.AllZipDao;
import com.biz.dao.ConCernZipDao;
import com.hibernate.entity.ArComment;
import com.hibernate.entity.Article;
import com.hibernate.entity.BlogUser;
import com.hibernate.entity.Concern;
import com.hibernate.entity.Say;
import com.hibernate.entity.UserMessage;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.struts.bean.LikeArticle;
import com.struts.bean.SortClass;

public class showAction extends ActionSupport {

	
//	ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
//	AllZipDao allZipDao = (AllZipDao) ac.getBean("AllZipDao");
	private LikeArticle likear;
	private AllZipDao allZipDao;
	private Integer id;
	private ConCernZipDao czd;

	public ConCernZipDao getCzd() {
		return czd;
	}

	public void setCzd(ConCernZipDao czd) {
		this.czd = czd;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public LikeArticle getLikear() {
		return likear;
	}

	public void setLikear(LikeArticle likear) {
		this.likear = likear;
	}

	public AllZipDao getAllZipDao() {
		return allZipDao;
	}

	public void setAllZipDao(AllZipDao allZipDao) {
		this.allZipDao = allZipDao;
	}
	
	//��ҳ��ʾȫ����Ϣ��action����
	public String showIndex(){
		//��ȡsession
		ActionContext ac = ActionContext.getContext();
		Map session = ac.getSession();
		try {
			//��õ�¼ʱ������session���û�����
			BlogUser bu1 = (BlogUser) session.get("user");
			List<Concern> concern =  czd.findAllFriByMineId((int) bu1.getUserId());
			//�û���Ϣ
			UserMessage um = allZipDao.findUserMessageByUserId((int) bu1.getUserId());
			Map<String, List> allMap = allZipDao.findAlltable((int) bu1.getUserId());
			if(allMap!=null){
			List<BlogUser> buList = new ArrayList<BlogUser>();
			buList.add(bu1);//��װ���Ա�ǰ̨����
			List<Say> sayList = allMap.get("say");//��ȡ˵˵����
			List<Article> arList = allMap.get("article");//��ȡ���¼���
			
			//arList����ʱ������
			SortClass sort = new SortClass();//���ϱȽ�����com.struts.action.SortClass
			Collections.sort(arList,sort);
			Collections.reverse(arList);
			//������session��
			session.put("friend", concern);
			session.put("usermessage", um);
			session.put("user1", buList);
			session.put("say", sayList);
			session.put("article", arList);
//			System.out.println(userList.get(0).getUserName());
//			System.out.println(sayList.get(0).getSContext());
//			System.out.println(arList.get(0).getAContext());
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
	
//	����action
	public void likes(){
//		System.out.println("aaaaaaaaaaaaaaaaaaaa:"+ likear.articleid);
		if(likear.articleid!=null){
		Integer arid = Integer.parseInt(likear.articleid);
		try {
			allZipDao.updateLike(arid);
			//return SUCCESS;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			//return ERROR;
		}
		}
		
	} 
	
	public String wholeArticle(){
		
		ActionContext ac = ActionContext.getContext();
		Map session = ac.getSession();
		
		try {
			Article a1 = allZipDao.findArticleById(id);
			List<ArComment> arcommentList = allZipDao.findCommentByArId(id);
			if(a1!=null){
				session.put("arComment", arcommentList);
				session.put("wholeArticle", a1);
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
