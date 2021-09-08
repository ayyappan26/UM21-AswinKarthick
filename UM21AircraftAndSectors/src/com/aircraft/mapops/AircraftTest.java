package com.aircraft.mapops;

import java.sql.SQLException;

public class AircraftTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MapOperations mo = new MapOperations();
		//InsertIntoSectors it = new InsertIntoSectors();
		try {
			mo.mapOps();
			//it.insertToSector();
		} catch (/*ParseException |*/ SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
