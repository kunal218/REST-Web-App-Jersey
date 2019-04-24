package com.webservice.webservicedemo.service;

import com.webservice.webservicedemo.dao.UserDao;
import com.webservice.webservicedemo.dao.UserDaoImpl;
import com.webservice.webservicedemo.model.User;

public class UserServiceImpl implements UserService {

	UserDao userdao = new UserDaoImpl();

	public UserServiceImpl() {
	}

	public UserServiceImpl(UserDao userdao) {
		this.userdao = userdao;
	}

	@Override
	public void createUser(User user) {
		userdao.createUser(user);
	}

	@Override
	public User findUser(String id) {
		User user = userdao.findUser1(id);

		return user;
	}

	@Override
	public void deleteUser(String id) {
		userdao.deleteUser(id);
	}

	@Override
	public void updateUser(String id, User userjson) {
		userdao.updateUser(id, userjson);
	}

}
