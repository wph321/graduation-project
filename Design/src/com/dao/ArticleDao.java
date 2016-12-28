package com.dao;

import java.util.List;

import com.hibernate.entity.Article;

public interface ArticleDao {

	public List<Article> findAll(Integer id) throws Exception;
	
	public Article findArticleById(Integer id) throws Exception;
	
	public void addArticle(Article article) throws Exception;
	
	public void update(Article article) throws Exception;
	
	public void deleteById(Integer id) throws Exception;
	
	public Article findByTitle(String title) throws Exception;
}
