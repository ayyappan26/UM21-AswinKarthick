package com.query.test;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.db.connection.establish.DataConnection;

public class MapTest {
	
	public Map<Integer,List<Object>> mapTest ()throws SQLException{
		Map<Integer,List<Object>> map = new HashMap<Integer,List<Object>>();
		Connection con = DataConnection.getDbConnection();
		
		String que = "select * from empdet";
		
		Statement st = con.createStatement();
		ResultSet rs = st.executeQuery(que);
		
		int empID;
		String fName;
		String lName;
		int mobileNumber;
		float empSalary;
		int i = 1;
		while(rs.next()) {
			
			List<Object> empli = new ArrayList<Object>(); 
			
			empID = rs.getInt(1);
			fName = rs.getString(2);
			lName = rs.getString(3);
			mobileNumber = rs.getInt(4);
			empSalary = rs.getFloat(5);
			
			empli.add(empID);
			empli.add(fName);
			empli.add(lName);
			empli.add(mobileNumber);
			empli.add(empSalary);
			
			map.put(i++, empli);
			
		}
		
		return map;
	}
	

}
