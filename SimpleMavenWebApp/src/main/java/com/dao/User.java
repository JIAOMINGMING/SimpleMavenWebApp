package com.dao;

public class User {

	String userName;
	String passWordD;
	String email;
	String sex;
	String address;
	String description;

	public User(String userName, String passWordD, String email, String sex, String address, String description) {
		setUserName(userName);
		setPassWordD(passWordD);
		setEmail(email);
		setSex(sex);
		setAddress(address);
		setDescription(description);
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPassWordD() {
		return passWordD;
	}
	public void setPassWordD(String passWordD) {
		this.passWordD = passWordD;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}

}
