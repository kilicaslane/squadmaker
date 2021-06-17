package com.squadmaker.db;
import java.sql.*;

import com.squadmaker.entities.signupform;
public class usersignup {
public static void inserttrainee(signupform sup, String tday) throws ClassNotFoundException, SQLException {
	Connection connect = null;
	Dbhelper db = new Dbhelper();
	connect = db.getConnection();
	try {		
		String sql = String.format("INSERT INTO %s (username, ign, tier, druid, hfb, qfb, ctank, boonc, qchrono, alacren, banner, powerdps, condidps, special) VALUES(?,?,?,?,?,?,?,?,?,?,?,?,?,?);", tday);
		PreparedStatement statement = connect.prepareStatement(sql);
		statement.setString(1, com.squadmaker.entities.signupform.getUsername());
		statement.setString(2, com.squadmaker.entities.signupform.getIgn());
		statement.setInt(3, com.squadmaker.entities.signupform.getTier());
		statement.setInt(4, com.squadmaker.entities.signupform.getDruid());
		statement.setInt(5, com.squadmaker.entities.signupform.getHfb());
		statement.setInt(6, com.squadmaker.entities.signupform.getQfb());
		statement.setInt(7, com.squadmaker.entities.signupform.getCtank());
		statement.setInt(8, com.squadmaker.entities.signupform.getBoonc());
		statement.setInt(9, com.squadmaker.entities.signupform.getQchrono());
		statement.setInt(10, com.squadmaker.entities.signupform.getAlacren());
		statement.setInt(11, com.squadmaker.entities.signupform.getBanner());
		statement.setInt(12, com.squadmaker.entities.signupform.getPowerdps());
		statement.setInt(13, com.squadmaker.entities.signupform.getCondidps());
		statement.setInt(14, com.squadmaker.entities.signupform.getSpecialrole());
		statement.executeUpdate();
	} catch(SQLException e) {
		db.ShowError(e);
	}
	finally {
		connect.close();
	}	
}
}
