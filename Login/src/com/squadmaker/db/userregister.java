package com.squadmaker.db;
import java.sql.*;

import com.squadmaker.entities.user;
public class userregister {
	public static void insert(user user) throws SQLException, ClassNotFoundException {
		Connection connect = null;
		Dbhelper db = new Dbhelper();
		connect = db.getConnection();
		try {
			
			String sql = "INSERT INTO user (username, password, ign, li) VALUES(?,?,?,?);";
			PreparedStatement statement = connect.prepareStatement(sql);
			statement.setString(1, com.squadmaker.entities.user.getUsername());
			statement.setString(2, com.squadmaker.entities.user.getPassword());
			statement.setString(3, com.squadmaker.entities.user.getIgn());
			statement.setInt(4, com.squadmaker.entities.user.getLi());
			statement.executeUpdate();
		} catch(SQLException e) {
			db.ShowError(e);
		}
		finally {
			connect.close();
		}	
		
	}
}
