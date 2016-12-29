package com.dao;

import com.hibernate.entity.BlogUser;
import com.hibernate.entity.UserMessage;

public interface UserMessageDAO {

	public UserMessage findMessage(Integer id) throws Exception;
	
	public void updateMessage(UserMessage userMessage) throws Exception;
	
	public void updateUser(BlogUser blogUser) throws Exception;
	
}
