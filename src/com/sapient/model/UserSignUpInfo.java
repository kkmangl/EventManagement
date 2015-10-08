package com.sapient.model;

import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

public class UserSignUpInfo {
	
	@Size(min=2,max=30)
	@Pattern(regexp = "[^0-9]*")
	private String name;
	
	private String email;
	
	@Size(min=4, max=16)
	private String userName;
	private String password;
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
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

}
