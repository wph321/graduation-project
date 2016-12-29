package com.dao.impl;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.classic.Session;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.dao.UserMessageDAO;
import com.hibernate.entity.BlogUser;
import com.hibernate.entity.UserMessage;

public class UserMessageImpl extends HibernateDaoSupport implements UserMessageDAO {

	@Override
	public UserMessage findMessage(Integer id) throws Exception {
		// TODO Auto-generated method stub
		Session session = this.getSessionFactory().openSession();
//		String hql = "from UserMessage as um where um.blogUser.userId=?";
//		Query query = session.createQuery(hql);
//		query.setInteger(0, id);
//		List<UserMessage> umList = query.list();
		UserMessage um = (UserMessage) session.load(UserMessage.class, id);
		return um;
	}

	@Override
	public void updateMessage(UserMessage userMessage) throws Exception {
		// TODO Auto-generated method stub
		Session session = this.getSessionFactory().openSession();
		session.update(userMessage);
		session.beginTransaction().commit();
	}

	@Override
	public void updateUser(BlogUser blogUser) throws Exception {
		// TODO Auto-generated method stub
		Session session = this.getSessionFactory().openSession();
		session.update(blogUser);
		session.beginTransaction().commit();
	}

}
