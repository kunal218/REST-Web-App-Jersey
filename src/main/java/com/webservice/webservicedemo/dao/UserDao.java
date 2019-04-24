package com.webservice.webservicedemo.dao;

import com.webservice.webservicedemo.model.User;

public interface UserDao {

	public void createUser(User user);
	public void updateUser(String id,User user);
	public void deleteUser(String id);
	public User findUser1(String id);
}
