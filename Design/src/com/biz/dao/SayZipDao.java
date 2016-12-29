package com.biz.dao;

import java.util.List;

import com.hibernate.entity.Say;

public interface SayZipDao {

	public List<Say> findAllSayByUserId(Integer id)throws Exception;
	
	
}
