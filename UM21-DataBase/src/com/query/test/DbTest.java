package com.query.test;

import java.sql.SQLException;

public class DbTest {

	public static void main(String[] args) {
		
		QuerryTest qt = new QuerryTest();
		InsertTest it = new InsertTest();
		UpdateTest ut = new UpdateTest();
		try {
			it.insertQuery();
			qt.queryTestMethor();
			ut.UpdateQuery();
		} catch (SQLException e) {
			
			System.out.println(e.getMessage());
		}
	}

}
