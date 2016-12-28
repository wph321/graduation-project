package com.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.biz.impl.LoginZipDaoImpl;
import com.hibernate.entity.BlogUser;

public class LoginZipTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
		LoginZipDaoImpl lzdi = (LoginZipDaoImpl) ac.getBean("LoginZipDao");
		
		try {
			BlogUser bu = lzdi.findBlogUser("123456");
			System.out.println(bu.getUserNumber()+"/"+bu.getUserPassword()+"/"+bu.getUserName());
		
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
