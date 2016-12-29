package com.biz.dao;

import com.hibernate.entity.BlogUser;
import com.hibernate.entity.UserMessage;

public interface UserMessageZipDao {

	public void updateUserMessage(UserMessage userMessage) throws Exception;
	
	public void updateBlogUser(BlogUser user) throws Exception;

	public UserMessage findMessage(Integer id) throws Exception;
}
