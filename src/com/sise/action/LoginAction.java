package com.sise.action;

import com.sise.bean.User;

public class LoginAction {
	private User user;

	public LoginAction(User user) {
		super();
		this.user = user;
	}
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	public String execute(){
		return "success";
	}
}
