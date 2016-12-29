package com.test;

import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.biz.dao.AllZipDao;
import com.hibernate.entity.BlogUser;
import com.hibernate.entity.Say;


public class AllZipTest {

	@Autowired
	public static void main(String[] args) {

		ApplicationContext ac= new ClassPathXmlApplicationContext("applicationcontext.xml");
		AllZipDao azd = (AllZipDao) ac.getBean("AllZipDao");
		
//		try {
//			Map<String,List> allMap = azd.findAlltable(1);
//			
//			Set set = allMap.entrySet();         
//			Iterator i = set.iterator();         
//			List<BlogUser> buList = allMap.get("user");
//			for(BlogUser bu:buList){
//				System.out.println(bu.getUserId()+"/t"+bu.getUserName()+"/t"+bu.getUserPassword());
//			}
//			List<Say> sayList = allMap.get("say");
//			System.out.println(sayList.get(0).getSContext());
//			while(i.hasNext()){      
//			     Map.Entry<String, List> entry1=(Map.Entry<String, List>)i.next();    
//			     System.out.println(entry1.getKey()+"=="+entry1.getValue());
//				}
//			} catch (Exception e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		
		try {
			azd.updateLike(1);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
