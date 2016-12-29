package com.struts.bean;

import java.util.Comparator;

import com.hibernate.entity.Article;

public class SortClass implements Comparator {

	@Override
	public int compare(Object o1, Object o2) {
		// TODO Auto-generated method stub
		Article ar1 = (Article)o1;
		Article ar2 = (Article)o2;
		int flag = ar1.getAData().compareTo(ar2.getAData());
		return flag;
	}

}
