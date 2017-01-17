package com.bean.controllerBean;

import java.io.Serializable;

public class UserInformationForm implements Serializable {

	String userName;
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	String password;

}
