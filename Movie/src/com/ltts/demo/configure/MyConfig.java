package com.ltts.demo.configure;

import java.sql.Connection;
import java.sql.DriverManager;

public class MyConfig {
	public static Connection getConnection() throws Exception {
		Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/moviedemo","root","admin");
		return c;
	}
}
