package com.ltts.demo.configure2;

import java.sql.Connection;
import java.sql.DriverManager;

public class MyConfig2 {
	public static Connection getConnection() throws Exception {
		Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/production","root","admin");
		return c;
	}
}
