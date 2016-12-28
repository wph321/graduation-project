package com.hibernate.entity;

import java.util.Date;

/**
 * SayComment entity. @author MyEclipse Persistence Tools
 */

public class SayComment implements java.io.Serializable {

	// Fields

	private Integer SId;
	private BlogUser blogUser;
	private Say say;
	private String SContext;
	private Date SDate;
	private String SOption1;
	private String SOption2;

	// Constructors

	/** default constructor */
	public SayComment() {
	}

	/** minimal constructor */
	public SayComment(String SContext, Date SDate) {
		this.SContext = SContext;
		this.SDate = SDate;
	}

	/** full constructor */
	public SayComment(BlogUser blogUser, Say say, String SContext, Date SDate,
			String SOption1, String SOption2) {
		this.blogUser = blogUser;
		this.say = say;
		this.SContext = SContext;
		this.SDate = SDate;
		this.SOption1 = SOption1;
		this.SOption2 = SOption2;
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

	public Say getSay() {
		return this.say;
	}

	public void setSay(Say say) {
		this.say = say;
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

}