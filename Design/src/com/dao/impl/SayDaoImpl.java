package com.dao.impl;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.dao.SayDAO;
import com.hibernate.entity.Say;

public class SayDaoImpl extends HibernateDaoSupport implements SayDAO {

	
	@Override
	public List<Say> findAllSay(Integer id) throws Exception {
		// TODO Auto-generated method stub
		Session session = this.getSessionFactory().openSession();
		String hql = "from Say as s where s.blogUser.userId=?";
		Query query = session.createQuery(hql);
		query.setInteger(0,id);
		List<Say> sayList = query.list();
		return sayList;
	}

	@Override
	public Say findByUserId(Integer id) throws Exception {
		Session session = this.getSessionFactory().openSession();
		Say say = (Say) session.load(Say.class, id);
		return say;
	}

	@Override
	public void addSay(Say say) throws Exception {
		// TODO Auto-generated method stub
		Session session = this.getSessionFactory().openSession();
		session.save(say);
	}

	@Override
	public void deleteSayById(Integer id) throws Exception {
		// TODO Auto-generated method stub
		Session session = this.getSessionFactory().openSession();
		session.delete(id);
	}

	@Override
	public void deleteAllSay(Integer id) throws Exception {
		// TODO Auto-generated method stub
		Session session = this.getSessionFactory().openSession();
		session.delete(id);
	}

}
