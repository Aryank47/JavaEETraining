package com.netcracker.dao;

import com.netcracker.customexception.DatabaseException;
import com.netcracker.dto.User;

public interface UserDao {
	public boolean Authentication(User user) throws DatabaseException;

}
