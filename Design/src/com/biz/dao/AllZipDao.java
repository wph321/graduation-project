package com.biz.dao;

import java.util.List;
import java.util.Map;

import com.hibernate.entity.ArComment;
import com.hibernate.entity.Article;
import com.hibernate.entity.UserMessage;

public interface AllZipDao {

	@SuppressWarnings("rawtypes")
	public Map<String, List> findAlltable(Integer id) throws Exception;
	
	public void updateLike(Integer id)throws Exception;
	
	public Article findArticleById(Integer id)throws Exception;

	public List<ArComment> findCommentByArId(Integer id)throws Exception;
	
	public UserMessage findUserMessageByUserId(Integer id)throws Exception;
}
