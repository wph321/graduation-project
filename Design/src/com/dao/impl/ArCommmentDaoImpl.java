package com.dao.impl;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.dao.ArCommentDAO;
import com.hibernate.entity.ArComment;
import com.hibernate.entity.Article;

public class ArCommmentDaoImpl extends HibernateDaoSupport implements
		ArCommentDAO {

	
	@Override
	public List<ArComment> findAllByArticleId(Integer id) throws Exception {
		// TODO Auto-generated method stub
		Session session = this.getSessionFactory().openSession();
		
		String hql = "from ArComment as a where a.article.AId=?";
		Query query = session.createQuery(hql);
		query.setInteger(0,id);
		List<ArComment> arcList = query.list();
		return arcList;
	}

	@Override
	public void add(ArComment arcomment) throws Exception {
		// TODO Auto-generated method stub
		Session session = this.getSessionFactory().openSession();
		
		session.save(arcomment);
	}

	@Override
	public void deleteById(Integer id) throws Exception {
		// TODO Auto-generated method stub
		Session session = this.getSessionFactory().openSession();
		
		session.delete(id);
	}

	@Override
	public ArComment findByUserId(Integer id) throws Exception {
		Session session = this.getSessionFactory().openSession();
		
		return null;
		// TODO Auto-generated method stub
		 
	}

}
