package com.netcracker.service;

import com.netcracker.customexception.DatabaseException;
import com.netcracker.dao.UserDao;
import com.netcracker.dao.UserDaoImpl;
import com.netcracker.dto.User;

public class UserServiceImpl implements UserService {
	UserDao usr=new UserDaoImpl();
	@Override
	public boolean Authentication(User user) throws DatabaseException {
		// TODO Auto-generated method stub
		return usr.Authentication(user) ;
	}

}
