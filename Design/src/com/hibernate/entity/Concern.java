package com.hibernate.entity;


/**
 * Concern entity. @author MyEclipse Persistence Tools
 */

public class Concern implements java.io.Serializable {

	// Fields

	private Integer coId;
	private BlogUser blogUserByMineId;
	private BlogUser blogUserByFriendId;
	private String conOption1;
	private String conOption2;

	// Constructors

	/** default constructor */
	public Concern() {
	}

	/** full constructor */
	public Concern(BlogUser blogUserByMineId, BlogUser blogUserByFriendId,
			String conOption1, String conOption2) {
		this.blogUserByMineId = blogUserByMineId;
		this.blogUserByFriendId = blogUserByFriendId;
		this.conOption1 = conOption1;
		this.conOption2 = conOption2;
	}

	// Property accessors

	public Integer getCoId() {
		return this.coId;
	}

	public void setCoId(Integer coId) {
		this.coId = coId;
	}

	public BlogUser getBlogUserByMineId() {
		return this.blogUserByMineId;
	}

	public void setBlogUserByMineId(BlogUser blogUserByMineId) {
		this.blogUserByMineId = blogUserByMineId;
	}

	public BlogUser getBlogUserByFriendId() {
		return this.blogUserByFriendId;
	}

	public void setBlogUserByFriendId(BlogUser blogUserByFriendId) {
		this.blogUserByFriendId = blogUserByFriendId;
	}

	public String getConOption1() {
		return this.conOption1;
	}

	public void setConOption1(String conOption1) {
		this.conOption1 = conOption1;
	}

	public String getConOption2() {
		return this.conOption2;
	}

	public void setConOption2(String conOption2) {
		this.conOption2 = conOption2;
	}

}