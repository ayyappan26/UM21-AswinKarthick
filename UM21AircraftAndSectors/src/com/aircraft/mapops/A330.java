package com.aircraft.mapops;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.aircraft.DBConnect;

public class A330 {
	
	public List<Object> forA330()throws SQLException{
		
		SectorDTO sdto1 = new SectorDTO();
		String que = "select * FROM sector where aircraft_code = 'A330'";
		Connection con = DBConnect.getDbConnection();
		List<Object> ac1 = new ArrayList<Object>();
		
		Statement st1 = con.createStatement();
		ResultSet rs1 = st1.executeQuery(que);
		
		while(rs1.next()) {
			List<Object> ac = new ArrayList<Object>();
			
			sdto1.setSectorID(rs1.getString(1));
			sdto1.setAircraftCode(rs1.getString(2));
			sdto1.setFromStation(rs1.getString(3));
			sdto1.setToStation(rs1.getString(4));
			sdto1.setScheduleDate(rs1.getDate(5));
			sdto1.setScheduleTime(rs1.getInt(6));
			
			ac.add(sdto1.getSectorID());
			ac.add(sdto1.getAircraftCode());
			ac.add(sdto1.getFromStation());
			ac.add(sdto1.getToStation());
			ac.add(sdto1.getScheduleDate());
			ac.add(sdto1.getScheduleTime());
			
			ac1.add(ac);
		}
		return ac1;
		
	}

}
