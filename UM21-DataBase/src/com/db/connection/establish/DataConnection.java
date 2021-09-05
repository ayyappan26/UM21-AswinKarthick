package com.db.connection.establish;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DataConnection {

	public static void main(String[] args) {

		try {
			Connection con = getDbConnection();
			System.out.println(con);
		} catch (SQLException e) {
			System.out.println(e.getMessage());
	}
	}
	
	public static Connection getDbConnection() throws SQLException  {
		 
				try {
					Class.forName("oracle.jdbc.driver.OracleDriver");
				} catch (ClassNotFoundException e) {
					e.printStackTrace();
				}
				String url = "jdbc:oracle:thin:@localhost:1521:XE";
				String userName = "system";
				String password = "password-1";
				Connection con = DriverManager.getConnection(url,userName,password);
				return con;
	}

}
