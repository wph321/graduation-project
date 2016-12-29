package com.biz.impl;

import com.biz.dao.ArticleZipDao;
import com.dao.ArticleDao;
import com.hibernate.entity.Article;

public class ArticleBizImpl implements ArticleZipDao {

	private ArticleDao ad;
	
	
	public ArticleDao getAd() {
		return ad;
	}

	public void setAd(ArticleDao ad) {
		this.ad = ad;
	}

	@Override
	public void addArticle(Article article) throws Exception {
		// TODO Auto-generated method stub
		ad.addArticle(article);
	}

	@Override
	public void deleteArticle(Integer id) throws Exception {
		// TODO Auto-generated method stub
		ad.deleteById(id);
	}

}
