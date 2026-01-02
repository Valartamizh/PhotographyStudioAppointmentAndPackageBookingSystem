package com.studio.util;

import java.sql.*;

public class DBUtil {
	public static Connection getDBConnection() {
		Connection conn = null;
		 try {
			 Class.forName("oracle.jdbc.driver.OracleDriver");
			 
			 conn = DriverManager.getConnection("jdbc:oracle:thin:@127.0.0.1:1521:xe","java","java");
		 }catch(Exception e) {
			 System.out.print(e);
		 }
		 return conn;
	}
	
	public static void main(String[] args) {
		try {
		Connection con = DBUtil.getDBConnection();
		if(con != null) {
<<<<<<< HEAD
			System.out.print("Working");
=======
			System.out.print("Testing");
>>>>>>> 8bd147710614f80ad15a8634f0033095c6655bca
		}
		}catch(Exception e) {
			System.out.print(e);
		}
	}
}
