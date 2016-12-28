package com.dao;

import java.util.List;

import com.hibernate.entity.ArComment;

public interface ArCommentDAO {

	public List<ArComment> findAllByArticleId(Integer id) throws Exception;
	
	public void add(ArComment arcomment) throws Exception;
	
	public void deleteById(Integer id) throws Exception;
	
	public ArComment findByUserId(Integer id) throws Exception;
}
