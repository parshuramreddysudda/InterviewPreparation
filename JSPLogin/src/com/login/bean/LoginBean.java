package com.login.bean;

public class LoginBean {

	private String name;
	private String email;
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
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public LoginBean(String name, String email, String password) {
		super();
		this.name = name;
		this.email = email;
		this.password = password;
	}
	private String password;
	public LoginBean() {
		// TODO Auto-generated constructor stub
	}

}
