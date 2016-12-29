package com.struts.action;

import java.util.Date;
import java.util.Map;

import com.biz.dao.CommentZipDao;
import com.hibernate.entity.ArComment;
import com.hibernate.entity.Article;
import com.hibernate.entity.BlogUser;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

public class CommentAction extends ActionSupport {

	private Integer id;
	private String context;
	private CommentZipDao commentzipdao; 
	
	public CommentZipDao getCommentzipdao() {
		return commentzipdao;
	}
	public void setCommentzipdao(CommentZipDao commentzipdao) {
		this.commentzipdao = commentzipdao;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getContext() {
		return context;
	}
	public void setContext(String context) {
		this.context = context;
	}
	
	
	public String addarComment(){
		
		ActionContext acc = ActionContext.getContext();
		Map session = acc.getSession();
		session.put("id", id);
		BlogUser bu = (BlogUser) session.get("user");
		Article article = (Article) session.get("wholeArticle");
		article.setAId(id);
		ArComment ac = new ArComment();
		ac.setArcContext(context);
		ac.setArcDate(new Date());
		ac.setBlogUser(bu);
		ac.setArticle(article);
		try {
			commentzipdao.addArComment(ac);
			return SUCCESS;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return ERROR;
		}
	}
	
	
	
}
