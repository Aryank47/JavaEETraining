package com.netcracker.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.netcracker.allqueries.Query;
import com.netcracker.customexception.DatabaseException;
import com.netcracker.dbutil.DatabaseUtility;
import com.netcracker.dto.User;

public class UserDaoImpl implements UserDao {
	@Override
	public boolean Authentication(User user) throws DatabaseException {
		// TODO Auto-generated method stub
		boolean flag=false;
		Connection connection=DatabaseUtility.getDBConnection();
		try {
			PreparedStatement statement=connection.prepareStatement(Query.verify);
			statement.setString(1, user.getUsername());
			statement.setString(2, user.getPassword());
			ResultSet res=statement.executeQuery();
			
			if(res.next()) {
				flag=true;
			}
			DatabaseUtility.releaseConnection();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			throw new DatabaseException(e.getMessage());
		}
		
		
		
		return flag;
	}

}
