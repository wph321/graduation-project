package com.hibernate.entity;


/**
 * UserMessage entity. @author MyEclipse Persistence Tools
 */

public class UserMessage implements java.io.Serializable {

	// Fields

	private Integer MId;
	private BlogUser blogUser;
	private String MSex;
	private Integer MAge;
	private String MPhone;

	// Constructors

	/** default constructor */
	public UserMessage() {
	}

	/** full constructor */
	public UserMessage(BlogUser blogUser, String MSex, Integer MAge,
			String MPhone) {
		this.blogUser = blogUser;
		this.MSex = MSex;
		this.MAge = MAge;
		this.MPhone = MPhone;
	}

	// Property accessors

	public Integer getMId() {
		return this.MId;
	}

	public void setMId(Integer MId) {
		this.MId = MId;
	}

	public BlogUser getBlogUser() {
		return this.blogUser;
	}

	public void setBlogUser(BlogUser blogUser) {
		this.blogUser = blogUser;
	}

	public String getMSex() {
		return this.MSex;
	}

	public void setMSex(String MSex) {
		this.MSex = MSex;
	}

	public Integer getMAge() {
		return this.MAge;
	}

	public void setMAge(Integer MAge) {
		this.MAge = MAge;
	}

	public String getMPhone() {
		return this.MPhone;
	}

	public void setMPhone(String MPhone) {
		this.MPhone = MPhone;
	}

}