package com.netcracker.service;

import com.netcracker.customexception.DatabaseException;
import com.netcracker.dto.User;

public interface UserService {
	public boolean Authentication(User user) throws DatabaseException;
}
