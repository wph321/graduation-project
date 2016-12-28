package com.dao.impl;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.hibernate.classic.Session;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.dao.UserDAO;
import com.hibernate.entity.BlogUser;
import com.hibernate.entity.UserMessage;

public class UserDaoImpl extends HibernateDaoSupport implements UserDAO{

		@Override
	public List<BlogUser> findAllUser() throws Exception {
		return null;
	}

	@Override
	public List<BlogUser> fingUserById(Integer id) throws Exception {
		Session session = this.getSessionFactory().openSession();
		String hql = "from BlogUser where userId=?";
		Query query = session.createQuery(hql);
		query.setInteger(0, id);
		List<BlogUser> buList = query.list();
		return buList;
	}

	@Override
	public BlogUser findUserByName(String name) throws Exception {
		String hql = "from BlogUser where userNumber=?";
		Session session = this.getSessionFactory().openSession();
		Query query = session.createQuery(hql);
		query.setString(0, name);
		List<BlogUser> userList = query.list();
		BlogUser user = userList.get(0);
		return user;
	}

	@Override
	public void addUser(BlogUser user, UserMessage usermessage)
			throws Exception {
		Session session = this.getSessionFactory().openSession();
			session.save(user);
			session.save(usermessage);
	}

}
