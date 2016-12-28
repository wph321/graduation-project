package com.test;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.dao.ArCommentDAO;
import com.hibernate.entity.ArComment;

public class ArCommentDaoTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
		ArCommentDAO ad = (ArCommentDAO) ac.getBean("ArCommentDAO");
		
		try {
			List<ArComment> arList = ad.findAllByArticleId(1);
			for(ArComment arc:arList){
				System.out.println(arc.getArcContext()+arc.getArcId()+arc.getArcDate());
			}
		
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
