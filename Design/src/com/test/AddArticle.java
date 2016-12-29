package com.test;

import java.util.Date;
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.biz.impl.ArticleBizImpl;
import com.dao.UserDAO;
import com.hibernate.entity.Article;
import com.hibernate.entity.BlogUser;

public class AddArticle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
		ArticleBizImpl abi = (ArticleBizImpl) ac.getBean("ArticleBiz");
		UserDAO bu = (UserDAO) ac.getBean("UserDAO");
		Article article = new Article();
		article.setAContext("asdfaserqwerdfgzxcvz");
		article.setAData(new Date());
		article.setAOption1(null);
		article.setAOption2(null);
		article.setArComments(null);
		article.setATitle("qwer");
		article.setAType(null);
		try {
			List<BlogUser> buList = bu.fingUserById(1);
			for(BlogUser bu1:buList){
				article.setBlogUser(bu1);
				
			}
		} catch (Exception e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		try {
			abi.addArticle(article);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
