package com.dao;

import java.util.List;

import com.hibernate.entity.Concern;

public interface ConcernDao {

	public List<Concern> findByMineId(Integer id)throws Exception;
	
	public Concern findByfriendId(Integer id)throws Exception;
	
	public void deleteByFriendId(Integer id)throws Exception;
	
}
