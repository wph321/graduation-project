package com.biz.impl;

import com.biz.dao.LoginZipDao;
import com.dao.UserDAO;
import com.hibernate.entity.BlogUser;

public class LoginZipDaoImpl implements LoginZipDao {

	
	private UserDAO ud;
	private BlogUser bu;
	
	public UserDAO getUd() {
		return ud;
	}

	public void setUd(UserDAO ud) {
		this.ud = ud;
	}

	public BlogUser getBu() {
		return bu;
	}

	public void setBu(BlogUser bu) {
		this.bu = bu;
	}

	@Override
	public BlogUser findBlogUser(String name) throws Exception {
		
		bu = ud.findUserByName(name);
		
		return bu;
	}

}
