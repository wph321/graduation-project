package com.struts.bean;

public class zhuceUser {

	public String userName;
	public String userNumber;
	public String userPass;
	public String userHead;
	public String userPhone;
	public String userAge;
	public String userSex;
	
	public String getUserAge() {
		return userAge;
	}
	public void setUserAge(String userAge) {
		this.userAge = userAge;
	}
	public String getUserSex() {
		return userSex;
	}
	public void setUserSex(String userSex) {
		this.userSex = userSex;
	}
	public String getUserPhone() {
		return userPhone;
	}
	public void setUserPhone(String userPhone) {
		this.userPhone = userPhone;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getUserNumber() {
		return userNumber;
	}
	public void setUserNumber(String userNumber) {
		this.userNumber = userNumber;
	}
	public String getUserPass() {
		return userPass;
	}
	public void setUserPass(String userPass) {
		this.userPass = userPass;
	}
	public String getUserHead() {
		return userHead;
	}
	public void setUserHead(String userHead) {
		this.userHead = userHead;
	}
	@Override
	public String toString() {
		return "zhuceUser [userName=" + userName + ", userNumber=" + userNumber
				+ ", userPass=" + userPass + ", userHead=" + userHead
				+ ", userPhone=" + userPhone + ", userAge=" + userAge
				+ ", userSex=" + userSex + "]";
	}
	
	
	
	
}
