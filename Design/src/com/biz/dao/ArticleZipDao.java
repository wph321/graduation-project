package com.biz.dao;

import com.hibernate.entity.Article;
import com.hibernate.entity.BlogUser;
import com.hibernate.entity.UserMessage;

public interface ArticleZipDao {

	public void addArticle(Article article)throws Exception;
	
	public void deleteArticle(Integer id) throws Exception;
	
}
