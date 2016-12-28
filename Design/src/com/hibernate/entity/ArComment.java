package com.hibernate.entity;

import java.util.Date;

/**
 * ArComment entity. @author MyEclipse Persistence Tools
 */

public class ArComment implements java.io.Serializable {

	// Fields

	private Integer arcId;
	private BlogUser blogUser;
	private Article article;
	private String arcContext;
	private Date arcDate;
	private String arcOption1;
	private String arcOption2;

	// Constructors

	/** default constructor */
	public ArComment() {
	}

	/** minimal constructor */
	public ArComment(String arcContext, Date arcDate) {
		this.arcContext = arcContext;
		this.arcDate = arcDate;
	}

	/** full constructor */
	public ArComment(BlogUser blogUser, Article article, String arcContext,
			Date arcDate, String arcOption1, String arcOption2) {
		this.blogUser = blogUser;
		this.article = article;
		this.arcContext = arcContext;
		this.arcDate = arcDate;
		this.arcOption1 = arcOption1;
		this.arcOption2 = arcOption2;
	}

	// Property accessors

	public Integer getArcId() {
		return this.arcId;
	}

	public void setArcId(Integer arcId) {
		this.arcId = arcId;
	}

	public BlogUser getBlogUser() {
		return this.blogUser;
	}

	public void setBlogUser(BlogUser blogUser) {
		this.blogUser = blogUser;
	}

	public Article getArticle() {
		return this.article;
	}

	public void setArticle(Article article) {
		this.article = article;
	}

	public String getArcContext() {
		return this.arcContext;
	}

	public void setArcContext(String arcContext) {
		this.arcContext = arcContext;
	}

	public Date getArcDate() {
		return this.arcDate;
	}

	public void setArcDate(Date arcDate) {
		this.arcDate = arcDate;
	}

	public String getArcOption1() {
		return this.arcOption1;
	}

	public void setArcOption1(String arcOption1) {
		this.arcOption1 = arcOption1;
	}

	public String getArcOption2() {
		return this.arcOption2;
	}

	public void setArcOption2(String arcOption2) {
		this.arcOption2 = arcOption2;
	}

}