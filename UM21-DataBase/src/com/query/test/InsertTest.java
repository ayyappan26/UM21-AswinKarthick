package com.query.test;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.db.connection.establish.DataConnection;

public class InsertTest {
	
	public void insertQuery(){
		
		Connection con;
		try {
			con = DataConnection.getDbConnection();
			PreparedStatement ps = con.prepareStatement("insert into empdet values(?,?,?,?,?)");
			ps.setInt(1,004);
			ps.setString(2, "Steve");
			ps.setString(3, "Jobs");
			ps.setInt(4, 419);
			ps.setFloat(5, 10000);
			ps.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		}
		
		
		
	}

}
