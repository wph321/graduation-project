package com.hibernate.entity;

import java.util.HashSet;
import java.util.Set;

/**
 * BlogUser entity. @author MyEclipse Persistence Tools
 */

public class BlogUser implements java.io.Serializable {

	// Fields

	private Integer userId;
	private String userName;
	private String userNumber;
	private String userPassword;
	private String userHeadImg;
	private String userOption1;
	private String userOption2;
	private Set saies = new HashSet(0);
	private Set userMessages = new HashSet(0);
	private Set sayComments = new HashSet(0);
	private Set fileUploads = new HashSet(0);
	private Set arComments = new HashSet(0);
	private Set articles = new HashSet(0);

	// Constructors

	/** default constructor */
	public BlogUser() {
	}

	/** minimal constructor */
	public BlogUser(String userNumber, String userPassword) {
		this.userNumber = userNumber;
		this.userPassword = userPassword;
	}

	/** full constructor */
	public BlogUser(String userName, String userNumber, String userPassword,
			String userHeadImg, String userOption1, String userOption2,
			Set saies, Set userMessages, Set sayComments, Set fileUploads,
			Set arComments, Set articles) {
		this.userName = userName;
		this.userNumber = userNumber;
		this.userPassword = userPassword;
		this.userHeadImg = userHeadImg;
		this.userOption1 = userOption1;
		this.userOption2 = userOption2;
		this.saies = saies;
		this.userMessages = userMessages;
		this.sayComments = sayComments;
		this.fileUploads = fileUploads;
		this.arComments = arComments;
		this.articles = articles;
	}

	// Property accessors

	public Integer getUserId() {
		return this.userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}

	public String getUserName() {
		return this.userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getUserNumber() {
		return this.userNumber;
	}

	public void setUserNumber(String userNumber) {
		this.userNumber = userNumber;
	}

	public String getUserPassword() {
		return this.userPassword;
	}

	public void setUserPassword(String userPassword) {
		this.userPassword = userPassword;
	}

	public String getUserHeadImg() {
		return this.userHeadImg;
	}

	public void setUserHeadImg(String userHeadImg) {
		this.userHeadImg = userHeadImg;
	}

	public String getUserOption1() {
		return this.userOption1;
	}

	public void setUserOption1(String userOption1) {
		this.userOption1 = userOption1;
	}

	public String getUserOption2() {
		return this.userOption2;
	}

	public void setUserOption2(String userOption2) {
		this.userOption2 = userOption2;
	}

	public Set getSaies() {
		return this.saies;
	}

	public void setSaies(Set saies) {
		this.saies = saies;
	}

	public Set getUserMessages() {
		return this.userMessages;
	}

	public void setUserMessages(Set userMessages) {
		this.userMessages = userMessages;
	}

	public Set getSayComments() {
		return this.sayComments;
	}

	public void setSayComments(Set sayComments) {
		this.sayComments = sayComments;
	}

	public Set getFileUploads() {
		return this.fileUploads;
	}

	public void setFileUploads(Set fileUploads) {
		this.fileUploads = fileUploads;
	}

	public Set getArComments() {
		return this.arComments;
	}

	public void setArComments(Set arComments) {
		this.arComments = arComments;
	}

	public Set getArticles() {
		return this.articles;
	}

	public void setArticles(Set articles) {
		this.articles = articles;
	}

}