package com.biz.dao;

import java.util.List;

import com.hibernate.entity.Concern;

public interface ConCernZipDao {

	public List<Concern> findAllFriByMineId(Integer id)throws Exception;
	
	public void deleteByFriendId(Integer id)throws Exception;
}
