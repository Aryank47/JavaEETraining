package com.netcracker.beans;

public class UserBean {
	private String username;
	private String password;
	
	public UserBean() {
		super();
	}

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
	
	public boolean validateUser() {
		if(username.equals("aryan") & password.equals("1si16cs021")) {
			return true;
		}
		else {
			return false;
		}
	}

}
