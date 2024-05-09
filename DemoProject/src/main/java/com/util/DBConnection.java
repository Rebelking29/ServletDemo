package com.util;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBConnection {

	public static Connection getConnection() {
		
		Connection con = null;
		
		try {
			
			Class.forName("com.mysql.cj.jdbc.Driver");
			
<<<<<<< HEAD
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/student","root","Heyviru$29");
=======
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/student\",\"root\",\"root");
>>>>>>> 3f63c12dd85f600fa92c4f4875c19a443bea19fb
			
		} catch (Exception e) {
			
			e.printStackTrace();
		}
		
		return con;
	}
}
