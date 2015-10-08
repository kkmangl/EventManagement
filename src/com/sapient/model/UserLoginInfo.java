package com.sapient.model;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

<<<<<<< HEAD
import org.hibernate.validator.constraints.NotEmpty;
@Entity
@Table ( name = "USERNAME")
public class UserLoginInfo {
	@Id
	@Column(name = "USERNAME",nullable=false)
	@NotEmpty
=======
import javax.validation.constraints.Size;

public class UserLoginInfo {
	
	@Size(min=4, max=15)
>>>>>>> 6be25a55025d727baab64a8895d815542e739ee8
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
