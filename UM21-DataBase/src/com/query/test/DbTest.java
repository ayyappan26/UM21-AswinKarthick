package com.query.test;

import java.sql.SQLException;

public class DbTest {

	public static void main(String[] args) {
		
		QuerryTest qt = new QuerryTest();
		try {
			qt.queryTestMethor();
		} catch (SQLException e) {
			
			System.out.println(e.getMessage());
		}
	}

}
