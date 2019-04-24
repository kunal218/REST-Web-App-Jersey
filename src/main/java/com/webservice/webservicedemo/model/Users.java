package com.webservice.webservicedemo.model;

import java.util.List;

public class Users {

	public Users() {
	}
	
	private static List<User> users;

	public List<User> getUsers() {
		return users;
	}

	public void setUsers(List<User> users) {
		this.users = users;
	}
	
}
