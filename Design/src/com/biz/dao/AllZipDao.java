package com.biz.dao;

import java.util.List;
import java.util.Map;

public interface AllZipDao {

	@SuppressWarnings("rawtypes")
	Map<String, List> findAlltable(Integer id) throws Exception;
	
	
}
