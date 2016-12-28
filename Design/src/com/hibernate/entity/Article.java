package com.hibernate.entity;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * Article entity. @author MyEclipse Persistence Tools
 */

public class Article implements java.io.Serializable {

	// Fields

	private Integer AId;
	private BlogUser blogUser;
	private String ATitle;
	private String AContext;
	private Date AData;
	private String AType;
	private String AOption1;
	private String AOption2;
	private Set arComments = new HashSet(0);

	// Constructors

	/** default constructor */
	public Article() {
	}

	/** minimal constructor */
	public Article(String ATitle, String AContext, Date AData) {
		this.ATitle = ATitle;
		this.AContext = AContext;
		this.AData = AData;
	}

	/** full constructor */
	public Article(BlogUser blogUser, String ATitle, String AContext,
			Date AData, String AType, String AOption1, String AOption2,
			Set arComments) {
		this.blogUser = blogUser;
		this.ATitle = ATitle;
		this.AContext = AContext;
		this.AData = AData;
		this.AType = AType;
		this.AOption1 = AOption1;
		this.AOption2 = AOption2;
		this.arComments = arComments;
	}

	// Property accessors

	public Integer getAId() {
		return this.AId;
	}

	public void setAId(Integer AId) {
		this.AId = AId;
	}

	public BlogUser getBlogUser() {
		return this.blogUser;
	}

	public void setBlogUser(BlogUser blogUser) {
		this.blogUser = blogUser;
	}

	public String getATitle() {
		return this.ATitle;
	}

	public void setATitle(String ATitle) {
		this.ATitle = ATitle;
	}

	public String getAContext() {
		return this.AContext;
	}

	public void setAContext(String AContext) {
		this.AContext = AContext;
	}

	public Date getAData() {
		return this.AData;
	}

	public void setAData(Date AData) {
		this.AData = AData;
	}

	public String getAType() {
		return this.AType;
	}

	public void setAType(String AType) {
		this.AType = AType;
	}

	public String getAOption1() {
		return this.AOption1;
	}

	public void setAOption1(String AOption1) {
		this.AOption1 = AOption1;
	}

	public String getAOption2() {
		return this.AOption2;
	}

	public void setAOption2(String AOption2) {
		this.AOption2 = AOption2;
	}

	public Set getArComments() {
		return this.arComments;
	}

	public void setArComments(Set arComments) {
		this.arComments = arComments;
	}

}