package com.struts.bean;

public class BlogLogin {

	public String username;
	public String pass;
	
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPass() {
		return pass;
	}
	public void setPass(String pass) {
		this.pass = pass;
	}
	@Override
	public String toString() {
		return "BlogLogin [username=" + username + ", pass=" + pass + "]";
	}
	
}
