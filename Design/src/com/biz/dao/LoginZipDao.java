package com.biz.dao;

import com.hibernate.entity.BlogUser;
import com.hibernate.entity.UserMessage;

public interface LoginZipDao {

	public BlogUser findBlogUser(String name) throws Exception;
	
	public void addUser(BlogUser user,UserMessage usermessage)throws Exception;
}
