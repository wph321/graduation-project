package com.dao.impl;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.dao.ArticleDao;
import com.hibernate.entity.Article;

public class ArticleDaoImpl extends HibernateDaoSupport implements ArticleDao {

	
	
	@Override
	public List<Article> findAll(Integer id) throws Exception {
		Session session = this.getSessionFactory().openSession();
		String hql = "from Article as a where a.blogUser.userId=?";
		Query query = session.createQuery(hql);
		query.setInteger(0, id);
		List<Article> arList = query.list();
		return arList;
	}

	@Override
	public Article findArticleById(Integer id) throws Exception {
		Session session = this.getSessionFactory().openSession();
		Article ar = (Article) session.load(Article.class, id);
		return ar;
	}

	@Override
	public void addArticle(Article article) throws Exception {
		// TODO Auto-generated method stub
		Session session = this.getSessionFactory().openSession();
		session.save(article);
		session.beginTransaction().commit();
	}

	@Override
	public void update(Article article) throws Exception {
		// TODO Auto-generated method stub
		Session session = this.getSessionFactory().openSession();
		session.update(article);
		session.beginTransaction().commit();
	}

	@Override
	public void deleteById(Integer id) throws Exception {
		// TODO Auto-generated method stub
		Session session = this.getSessionFactory().openSession();
		session.delete(id);
		session.beginTransaction().commit();
	}

	@Override
	public Article findByTitle(String title) throws Exception {
		// TODO Auto-generated method stub
		Session session = this.getSessionFactory().openSession();
		String hql = "from Article where ATitle = ?";
		Query query = session.createQuery(hql);
		query.setString(0, title);
		List<Article> arList = query.list();
		Article ar = arList.get(0);
//		session.close();
		return ar;
		
	}

	@Override
	public void updateLikes(Integer id) throws Exception {
		// TODO Auto-generated method stub
		
		Session session = this.getSessionFactory().openSession();
		Article article = (Article) session.get(Article.class, id);
		String option1 = Integer.toString(Integer.parseInt(article.getAOption1())+1);
		System.out.println("likes:"+option1);
		article.setAOption1(option1);
		session.update(article);
		session.beginTransaction().commit();
		session.close();
	}

}
