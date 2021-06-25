package com.ltts.prod.configure;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.*;

public class MyConfig {
	public static Connection getConnection() throws Exception {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/moviedemo","root","admin");
		return c;
	}
}
