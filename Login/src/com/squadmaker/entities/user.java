package com.squadmaker.entities;

public class user {
	private static int id;
	private static String username;
	private static String password;
	private static String ign;
	private static int li;
	public static int getId() {
		return id;
	}
	public static void setId(int id) {
		user.id = id;
	}
	public static String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		user.username = username;
	}
	public static String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		user.password = password;
	}
	public static String getIgn() {
		return ign;
	}
	public void setIgn(String ign) {
		user.ign = ign;
	}
	public static int getLi() {
		return li;
	}
	public void setLi(int li) {
		user.li = li;
	}
	
}
