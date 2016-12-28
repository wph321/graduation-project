package com.hibernate.entity;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * Say entity. @author MyEclipse Persistence Tools
 */

public class Say implements java.io.Serializable {

	// Fields

	private Integer SId;
	private BlogUser blogUser;
	private String SContext;
	private Date SDate;
	private String SImage;
	private String SOption1;
	private String SOption2;
	private Set sayComments = new HashSet(0);

	// Constructors

	/** default constructor */
	public Say() {
	}

	/** minimal constructor */
	public Say(String SContext, Date SDate) {
		this.SContext = SContext;
		this.SDate = SDate;
	}

	/** full constructor */
	public Say(BlogUser blogUser, String SContext, Date SDate, String SImage,
			String SOption1, String SOption2, Set sayComments) {
		this.blogUser = blogUser;
		this.SContext = SContext;
		this.SDate = SDate;
		this.SImage = SImage;
		this.SOption1 = SOption1;
		this.SOption2 = SOption2;
		this.sayComments = sayComments;
	}

	// Property accessors

	public Integer getSId() {
		return this.SId;
	}

	public void setSId(Integer SId) {
		this.SId = SId;
	}

	public BlogUser getBlogUser() {
		return this.blogUser;
	}

	public void setBlogUser(BlogUser blogUser) {
		this.blogUser = blogUser;
	}

	public String getSContext() {
		return this.SContext;
	}

	public void setSContext(String SContext) {
		this.SContext = SContext;
	}

	public Date getSDate() {
		return this.SDate;
	}

	public void setSDate(Date SDate) {
		this.SDate = SDate;
	}

	public String getSImage() {
		return this.SImage;
	}

	public void setSImage(String SImage) {
		this.SImage = SImage;
	}

	public String getSOption1() {
		return this.SOption1;
	}

	public void setSOption1(String SOption1) {
		this.SOption1 = SOption1;
	}

	public String getSOption2() {
		return this.SOption2;
	}

	public void setSOption2(String SOption2) {
		this.SOption2 = SOption2;
	}

	public Set getSayComments() {
		return this.sayComments;
	}

	public void setSayComments(Set sayComments) {
		this.sayComments = sayComments;
	}

}