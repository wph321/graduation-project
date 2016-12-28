package com.biz.dao;

import com.hibernate.entity.BlogUser;

public interface LoginZipDao {

	public BlogUser findBlogUser(String name) throws Exception;
	
}
