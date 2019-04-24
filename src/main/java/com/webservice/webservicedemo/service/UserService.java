package com.webservice.webservicedemo.service;

import com.webservice.webservicedemo.model.User;

public interface UserService {

	public void createUser(User user);
	public void updateUser(String id,User user);
	public void deleteUser(String id);
	public User findUser(String id);
}
