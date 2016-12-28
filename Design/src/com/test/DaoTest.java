package com.test;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.dao.UserDAO;
import com.hibernate.entity.Article;
import com.hibernate.entity.BlogUser;


public class DaoTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
		UserDAO bu = (UserDAO) ac.getBean("UserDAO");
		
		List<BlogUser> buList;
		try {
			buList = bu.findAllUser();
			for(BlogUser bu1:buList){
				
				System.out.println(bu1.getUserId());
				System.out.println(bu1.getUserName());
				System.out.println(buList);
			}
		} catch (Exception e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		List<BlogUser> buser;
		try {
			buser = bu.fingUserById(1);
				BlogUser user = buser.get(0);
				System.out.println(user.getUserHeadImg()+"/t"+user.getUserName()+"/t"+user.getUserNumber());
//			List<Article> arcList = bu.findAll();
//			for(Article arc:arcList){
//				System.out.println(arc.getAContext()+"dddd"+arc.getATitle());
//			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}