package com.bridgelabz.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bridgelabz.dao.UserDao;
import com.bridgelabz.model.Login;
import com.bridgelabz.model.User;

 @Service("userService")
public class UserServiceImpl implements UserService {
	 
	@Autowired
    public UserDao userDao;
	public void register(User user) {
		
		userDao.register(user);
	}

	public User validateUser(Login login) 
	{
		User user=userDao.ValidatUser(login);
		
		return user;
	}

}
