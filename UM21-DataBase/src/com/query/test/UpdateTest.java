package com.query.test;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.db.connection.establish.DataConnection;

public class UpdateTest {
	
public void UpdateQuery(){
		
		Connection con;
		try {
			con = DataConnection.getDbConnection();
			PreparedStatement ps = con.prepareStatement("update empdet set salary = ? where empid = ?");
			ps.setFloat(1, 20000);
			ps.setInt(2,004);
			ps.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		}
		
		
		
	}

}
