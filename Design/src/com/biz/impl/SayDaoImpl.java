package com.biz.impl;

import java.util.List;

import com.biz.dao.SayZipDao;
import com.dao.SayDAO;
import com.hibernate.entity.Say;

public class SayDaoImpl implements SayZipDao {

	
	private SayDAO saydao;
	
	public SayDAO getSaydao() {
		return saydao;
	}

	public void setSaydao(SayDAO saydao) {
		this.saydao = saydao;
	}

	@Override
	public List<Say> findAllSayByUserId(Integer id) throws Exception {
		// TODO Auto-generated method stub
		return saydao.findAllSay(id);
	}

	

}
