package com.struts.action;

import java.util.Date;
import java.util.Map;

import com.biz.impl.ArticleBizImpl;
import com.hibernate.entity.Article;
import com.hibernate.entity.BlogUser;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.struts.bean.StrutsArticle;

public class ArticleAction extends ActionSupport {

	private StrutsArticle ac;
	public StrutsArticle getAc() {
		return ac;
	}

	public void setAc(StrutsArticle ac) {
		this.ac = ac;
	}

	private ArticleBizImpl abi;
	public ArticleBizImpl getAbi() {
		return abi;
	}

	public void setAbi(ArticleBizImpl abi) {
		this.abi = abi;
	}

	public String article(){
		
		ActionContext acc = ActionContext.getContext();
		Map session = acc.getSession();
		
		BlogUser bu = (BlogUser) session.get("user");
		System.out.println(bu.getUserName()+bu.getUserNumber());
		
		if(ac.context!=null&&ac.title!=null){
			BlogUser buser = (BlogUser) session.get("user");
			Article article = new Article();
			Date date = new Date();
			article.setAData(date);
			article.setATitle(ac.title);
			article.setAContext(ac.context);
			article.setArComments(null);
			article.setAType(null);
			article.setBlogUser(buser);
			try {
				abi.addArticle(article);
				return SUCCESS;
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				return ERROR;
			}
			
		}
		return ERROR;
		
	}
	
}
