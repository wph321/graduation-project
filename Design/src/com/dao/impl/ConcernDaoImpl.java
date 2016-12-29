package com.dao.impl;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.dao.ConcernDao;
import com.hibernate.entity.Concern;

public class ConcernDaoImpl extends HibernateDaoSupport implements ConcernDao {

	@Override
	public List<Concern> findByMineId(Integer id) throws Exception {
		Session session = this.getSessionFactory().openSession();
		String hql="from Concern as c where c.blogUserByMineId.userId=?";
		Query query = session.createQuery(hql);
		query.setInteger(0, id);
		List<Concern> conList = query.list();
		return conList;
	}

	@Override
	public Concern findByfriendId(Integer id) throws Exception {
		Session session = this.getSessionFactory().openSession();
		
		return null;
	}

	@Override
	public void deleteByFriendId(Integer id) throws Exception {
		// TODO Auto-generated method stub
		Session session = this.getSessionFactory().openSession();
		session.delete(id);;
	}

}
