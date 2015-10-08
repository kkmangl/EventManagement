package com.sapient.model;

import javax.validation.constraints.Size;

public class UserLoginInfo {
	
	@Size(min=4, max=15)
	private String username;
	private String password;
	
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
}
