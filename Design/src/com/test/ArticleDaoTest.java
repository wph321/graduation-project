package com.test;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.dao.ArticleDao;
import com.hibernate.entity.Article;

public class ArticleDaoTest {

	public static void main(String[] args) {
		ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
		ArticleDao ad = (ArticleDao) ac.getBean("ArticleDAO");
		
		try {
			List<Article> arList = ad.findAll(1);
			for(Article ar:arList){
				System.out.println(ar.getAContext()+ar.getATitle());
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
}
