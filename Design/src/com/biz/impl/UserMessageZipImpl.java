package com.biz.impl;

import com.biz.dao.UserMessageZipDao;
import com.dao.UserMessageDAO;
import com.hibernate.entity.BlogUser;
import com.hibernate.entity.UserMessage;

public class UserMessageZipImpl implements UserMessageZipDao {

	private UserMessageDAO usermessagedao;

	public UserMessageDAO getUsermessagedao() {
		return usermessagedao;
	}

	public void setUsermessagedao(UserMessageDAO usermessagedao) {
		this.usermessagedao = usermessagedao;
	}

	@Override
	public void updateUserMessage(UserMessage userMessage) throws Exception {
		// TODO Auto-generated method stub
		usermessagedao.updateMessage(userMessage);
	}

	@Override
	public void updateBlogUser(BlogUser user) throws Exception {
		// TODO Auto-generated method stub
		usermessagedao.updateUser(user);
	}

	@Override
	public UserMessage findMessage(Integer id) throws Exception {
		// TODO Auto-generated method stub
		UserMessage um = usermessagedao.findMessage(id);
		return um;
	}

}
