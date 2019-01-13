package com.lxx.service;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.lxx.dao.UserDao;
import com.lxx.entity.User;

@Service("userService")
public class UserServiceImp implements UserService {
	@Resource
	private UserDao userDao;

	public List<User> findUser() {
		List<User> users = userDao.findAll();
		return users;
	}
	
}
