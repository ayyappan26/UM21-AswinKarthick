package com.aircraft.mapops;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.text.ParseException;
import java.util.Scanner;

import com.aircraft.DBConnect;

public class InsertIntoSectors {
	
	SectorDTO sdto2 = new SectorDTO();
	public void insertToSector() throws ParseException {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.println("The available Aircraft Codes are A330, A380, B777");
		System.out.println("Enter the SectorID");
		sdto2.setSectorID(sc.next());
		System.out.println("Enter the Aircraft Code");
		sdto2.setAircraftCode(sc.next());
		System.out.println("Enter the From Station");
		sdto2.setFromStation(sc.next());
		System.out.println("Enter the TO Station");
		sdto2.setToStation(sc.next());
		//System.out.println("Enter the Schedule Date");
		//sDate1 = sc.next();
		//Date date1=(Date) new SimpleDateFormat("dd/MM/yy").parse(sDate1);
		//sdto2.setScheduleDate(date1);
		System.out.println("Enter the Schedule Time");
		sdto2.setScheduleTime(sc.nextInt());
		
		try {
			Connection con = DBConnect.getDbConnection();
			PreparedStatement ps = con.prepareStatement("insert into sector values(?,?,?,?,?,?)");
			ps.setString(1,sdto2.getSectorID());
			ps.setString(2, sdto2.getAircraftCode());
			ps.setString(3, sdto2.getFromStation());
			ps.setString(4, sdto2.getToStation());
			ps.setDate(5, getCurrentDate());
			ps.setObject(6, sdto2.getScheduleTime());
			ps.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		}
		
	}
	
	private static java.sql.Date getCurrentDate() {
	    java.util.Date today = new java.util.Date();
	    return new java.sql.Date(today.getTime());
	}

}
