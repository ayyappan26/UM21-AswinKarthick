	package com.query.test;

	import java.sql.Connection;
	import java.sql.ResultSet;
	import java.sql.SQLException;
	import java.sql.Statement;

	import com.db.connection.establish.DataConnection;

	public class QuerryTest {
		
		public void queryTestMethor() throws SQLException {
			
			Connection con = DataConnection.getDbConnection();
			
			String que = "select * from empdet";
			
			Statement st = con.createStatement();
			ResultSet rs = st.executeQuery(que);
			
			int empID;
			String fName;
			String lName;
			int mobileNumber;
			float empSalary;
			
			while(rs.next()) {
				empID = rs.getInt(1);
				fName = rs.getString(2);
				lName = rs.getString(3);
				mobileNumber = rs.getInt(4);
				empSalary = rs.getFloat(5);
				
				System.out.println(empID);
				System.out.println(fName);
				System.out.println(lName);
				System.out.println(mobileNumber);
				System.out.println(empSalary);
				
			}
		}

	}


