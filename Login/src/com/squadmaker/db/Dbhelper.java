package com.squadmaker.db;
import java.sql.*;
public class Dbhelper {
	static String username = "root";
	static String password = "1234567899";
	static String dbUrl = "jdbc:mysql://localhost:3306/users";

	public Connection getConnection() throws SQLException, ClassNotFoundException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		return(Connection) DriverManager.getConnection(dbUrl, username, password);
	}
		
	public void ShowError(SQLException exception) {
		System.out.println("Error= "+ exception.getMessage());
		System.out.println("ErrorCode= "+ exception.getErrorCode());
	}

}
