package com.biz.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.biz.dao.AllZipDao;
import com.dao.ArCommentDAO;
import com.dao.ArticleDao;
import com.dao.SayDAO;
import com.dao.UserDAO;
import com.dao.UserMessageDAO;
import com.hibernate.entity.ArComment;
import com.hibernate.entity.Article;
import com.hibernate.entity.BlogUser;
import com.hibernate.entity.Say;
import com.hibernate.entity.UserMessage;

public class AllZipImpl implements AllZipDao {

	private UserDAO buDao;
	private SayDAO sayDao;
	private ArticleDao articleDao;
	private ArCommentDAO arcommentdao;
	private UserMessageDAO usermessagedao;
	
	public UserMessageDAO getUsermessagedao() {
		return usermessagedao;
	}

	public void setUsermessagedao(UserMessageDAO usermessagedao) {
		this.usermessagedao = usermessagedao;
	}

	public ArCommentDAO getArcommentdao() {
		return arcommentdao;
	}

	public void setArcommentdao(ArCommentDAO arcommentdao) {
		this.arcommentdao = arcommentdao;
	}

	public UserDAO getBuDao() {
		return buDao;
	}

	public void setBuDao(UserDAO buDao) {
		this.buDao = buDao;
	}
	
	public SayDAO getSayDao() {
		return sayDao;
	}

	public void setSayDao(SayDAO sayDao) {
		this.sayDao = sayDao;
	}

	public ArticleDao getArticleDao() {
		return articleDao;
	}

	public void setArticleDao(ArticleDao articleDao) {
		this.articleDao = articleDao;
	}

	@SuppressWarnings("rawtypes")
	@Override
	public Map<String, List> findAlltable(Integer id) throws Exception {
		
		
		List<BlogUser> buList =  buDao.fingUserById(id);
		List<Say> sayList = sayDao.findAllSay(id);
		List<Article> arList = articleDao.findAll(id);
		
		Map<String,List> allMap = new HashMap<String,List>();
		allMap.put("user", buList);
		allMap.put("say", sayList);
		allMap.put("article",arList);
		return allMap;
	}

	@Override
	public void updateLike(Integer id) throws Exception {
		// TODO Auto-generated method stub
		
		articleDao.updateLikes(id);
		
	}

	@Override
	public Article findArticleById(Integer id) throws Exception {
		// TODO Auto-generated method stub
		
		return articleDao.findArticleById(id);
		
	}

	@Override
	public List<ArComment> findCommentByArId(Integer id) throws Exception {
		
		return  arcommentdao.findAllByArticleId(id);
	}

	@Override
	public UserMessage findUserMessageByUserId(Integer id) throws Exception {
		// TODO Auto-generated method stub
		return usermessagedao.findMessage(id);
	}
	
	
	

	
}
