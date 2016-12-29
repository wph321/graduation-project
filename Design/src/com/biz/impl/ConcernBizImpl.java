package com.biz.impl;

import java.util.List;

import com.biz.dao.ConCernZipDao;
import com.dao.ConcernDao;
import com.hibernate.entity.Concern;

public class ConcernBizImpl implements ConCernZipDao {

	
	private ConcernDao concerndao;
	public ConcernDao getConcerndao() {
		return concerndao;
	}

	public void setConcerndao(ConcernDao concerndao) {
		this.concerndao = concerndao;
	}

	@Override
	public List<Concern> findAllFriByMineId(Integer id) throws Exception {
		// TODO Auto-generated method stub
		
		return concerndao.findByMineId(id);
	}

	@Override
	public void deleteByFriendId(Integer id) throws Exception {
		// TODO Auto-generated method stub
		concerndao.deleteByFriendId(id);
	}

}
