package com.biz.impl;

import com.biz.dao.CommentZipDao;
import com.dao.ArCommentDAO;
import com.hibernate.entity.ArComment;

public class CommentZipImpl implements CommentZipDao {

	private	ArCommentDAO arCommentDao;
	
	public ArCommentDAO getArCommentDao() {
		return arCommentDao;
	}

	public void setArCommentDao(ArCommentDAO arCommentDao) {
		this.arCommentDao = arCommentDao;
	}

	@Override
	public void addArComment(ArComment ac) throws Exception {
		// TODO Auto-generated method stub
		arCommentDao.add(ac);
	}



}
