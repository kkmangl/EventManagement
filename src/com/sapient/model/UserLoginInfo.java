package com.sapient.model;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.validator.constraints.NotEmpty;
@Entity
@Table ( name = "USERNAME")
public class UserLoginInfo {
	@Id
	@Column(name = "USERNAME",nullable=false)
	@NotEmpty
	private String username;
	@Column(name = "PASSWORD",nullable=false)
	@NotEmpty
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
