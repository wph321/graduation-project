package com.struts.bean;

public class UpdateUser {

	public String username;
	public String userhead;
	public String useriphone;
	public String usersex;
	public String userage;
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getUserhead() {
		return userhead;
	}
	public void setUserhead(String userhead) {
		this.userhead = userhead;
	}
	public String getUseriphone() {
		return useriphone;
	}
	public void setUseriphone(String useriphone) {
		this.useriphone = useriphone;
	}
	public String getUsersex() {
		return usersex;
	}
	public void setUsersex(String usersex) {
		this.usersex = usersex;
	}
	public String getUserage() {
		return userage;
	}
	public void setUserage(String userage) {
		this.userage = userage;
	}
	@Override
	public String toString() {
		return "UpdateUser [username=" + username + ", userhead=" + userhead
				+ ", useriphone=" + useriphone + ", usersex=" + usersex
				+ ", userage=" + userage + "]";
	}
	
}
