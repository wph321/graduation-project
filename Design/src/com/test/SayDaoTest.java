package com.test;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.dao.SayDAO;
import com.hibernate.entity.Say;

public class SayDaoTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
		SayDAO sd = (SayDAO) ac.getBean("SayDAO");
		
		try {
			Say say = sd.findByUserId(1);
			List<Say> sayList = sd.findAllSay(1);
			System.out.println(say);
			for(Say say1:sayList){
				System.out.println(say1.getSContext()+say1.getSDate());
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
