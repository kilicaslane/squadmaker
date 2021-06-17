package com.squadmaker.db;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.squadmaker.entities.user;

public class commanderlogin {
	public static user checkcomm(String username, String password) throws ClassNotFoundException, SQLException {
		
		Connection connect = null;
		Dbhelper db = new Dbhelper();
		connect = db.getConnection();
		user user = null;
		try {
			String sql = "SELECT * FROM commander WHERE username=? and password=?";
			PreparedStatement statement = connect.prepareStatement(sql);
			statement.setString(1, username);
			statement.setString(2, password);
			ResultSet rs = statement.executeQuery();
			if(rs.next()) {				
				user = new user();
				com.squadmaker.entities.user.setId(rs.getInt("id"));
				user.setUsername(rs.getString("username"));
				user.setPassword(rs.getString("password"));
				user.setIgn(rs.getString("ign"));
				
			}
		 }catch(Exception e){
	            e.printStackTrace();
	        }
		return user;
		
		
		}
	}

