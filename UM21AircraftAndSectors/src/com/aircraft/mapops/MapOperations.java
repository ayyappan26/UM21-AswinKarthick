package com.aircraft.mapops;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.aircraft.DBConnect;

public class MapOperations {
	
	AircraftDTO adto = new AircraftDTO();
	SectorDTO sdto = new SectorDTO();
	A330 a330 = new A330();
	B777 b777 = new B777();
	public void mapOps() throws SQLException {
		
		Map<String,List<Object>> map = new HashMap<String,List<Object>>();
		List<Object> ac1 = new ArrayList<Object>();
		
			Connection con = DBConnect.getDbConnection();
			
			String que = "select aircraft_code from aircraft";
			
			Statement st = con.createStatement();
			ResultSet rs = st.executeQuery(que);
			
			while(rs.next()) {
				adto.setAircraftCode(rs.getString(1));
				map.put(adto.getAircraftCode(), null);
			}
			
			que = "select * FROM sector where aircraft_code = 'A380'";
			
			Statement st1 = con.createStatement();
			ResultSet rs1 = st1.executeQuery(que);
			
			while(rs1.next()) {
				List<Object> ac = new ArrayList<Object>();
				
				sdto.setSectorID(rs1.getString(1));
				sdto.setAircraftCode(rs1.getString(2));
				sdto.setFromStation(rs1.getString(3));
				sdto.setToStation(rs1.getString(4));
				sdto.setScheduleDate(rs1.getDate(5));
				sdto.setScheduleTime(rs1.getInt(6));
				
				ac.add(sdto.getSectorID());
				ac.add(sdto.getAircraftCode());
				ac.add(sdto.getFromStation());
				ac.add(sdto.getToStation());
				ac.add(sdto.getScheduleDate());
				ac.add(sdto.getScheduleTime());
				
				ac1.add(ac);
			}
			
			map.replace("A380", ac1);
			map.replace("A330", a330.forA330());
			map.replace("B777", b777.forB777());
			//System.out.println(ac1);
			
			System.out.println(map);
		
	}

}
