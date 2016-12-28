package com.hibernate.entity;

import java.util.Date;

/**
 * FileUpload entity. @author MyEclipse Persistence Tools
 */

public class FileUpload implements java.io.Serializable {

	// Fields

	private Integer FId;
	private BlogUser blogUser;
	private String FName;
	private String FPath;
	private String FType;
	private Date FDate;
	private Integer FSize;

	// Constructors

	/** default constructor */
	public FileUpload() {
	}

	/** minimal constructor */
	public FileUpload(String FName, String FPath, String FType, Date FDate) {
		this.FName = FName;
		this.FPath = FPath;
		this.FType = FType;
		this.FDate = FDate;
	}

	/** full constructor */
	public FileUpload(BlogUser blogUser, String FName, String FPath,
			String FType, Date FDate, Integer FSize) {
		this.blogUser = blogUser;
		this.FName = FName;
		this.FPath = FPath;
		this.FType = FType;
		this.FDate = FDate;
		this.FSize = FSize;
	}

	// Property accessors

	public Integer getFId() {
		return this.FId;
	}

	public void setFId(Integer FId) {
		this.FId = FId;
	}

	public BlogUser getBlogUser() {
		return this.blogUser;
	}

	public void setBlogUser(BlogUser blogUser) {
		this.blogUser = blogUser;
	}

	public String getFName() {
		return this.FName;
	}

	public void setFName(String FName) {
		this.FName = FName;
	}

	public String getFPath() {
		return this.FPath;
	}

	public void setFPath(String FPath) {
		this.FPath = FPath;
	}

	public String getFType() {
		return this.FType;
	}

	public void setFType(String FType) {
		this.FType = FType;
	}

	public Date getFDate() {
		return this.FDate;
	}

	public void setFDate(Date FDate) {
		this.FDate = FDate;
	}

	public Integer getFSize() {
		return this.FSize;
	}

	public void setFSize(Integer FSize) {
		this.FSize = FSize;
	}

}