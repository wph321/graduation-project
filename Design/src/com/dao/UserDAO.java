package com.dao;

import java.util.List;

import com.hibernate.entity.BlogUser;
import com.hibernate.entity.UserMessage;

public interface UserDAO {

	public List<BlogUser> findAllUser()throws Exception;
	
	public List<BlogUser> fingUserById(Integer id)throws Exception;
	
	public BlogUser findUserByName(String name)throws Exception;
	
	public void addUser(BlogUser user,UserMessage usermessage)throws Exception;
	
}
