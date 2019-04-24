package com.webservice.webservicedemo.dao;

import java.util.ArrayList;
import java.util.List;

import com.webservice.webservicedemo.model.User;
import com.webservice.webservicedemo.model.Users;

public class UserDaoImpl implements UserDao {
	static List<User> list = new ArrayList<>();

	public UserDaoImpl() {
	}

	Users userList = new Users();

	@Override
	public void createUser(User user) {

		list.add(user);
		userList.setUsers(list);
	}

	@Override
	public User findUser1(String id) {
		list = userList.getUsers();
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i).getId().equals(id)) {
				return list.get(i);
			}
		}
		return null;
	}

	@Override
	public void deleteUser(String id) {
		list = userList.getUsers();
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i).getId().equals(id)) {
				list.remove(i);
			}
		}
	}

	@Override
	public void updateUser(String id, User userjson) {
		User user = new User();
		list = userList.getUsers();
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i).getId().equals(id)) {
				list.remove(i);
				list.add(i, userjson);
			}

		}

	}

}
