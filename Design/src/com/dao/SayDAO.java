package com.dao;

import java.util.List;

import com.hibernate.entity.Say;

public interface SayDAO {

	public List<Say> findAllSay(Integer id)throws Exception;
	
	public Say findByUserId(Integer id)throws Exception;
	
	public void addSay(Say say) throws Exception;
	
	public void deleteSayById(Integer id)throws Exception;
	
	public void deleteAllSay(Integer id)throws Exception;
}
