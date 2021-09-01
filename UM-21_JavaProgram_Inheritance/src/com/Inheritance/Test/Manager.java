package com.Inheritance.Test;

public class Manager extends Employee {
	
	public Manager(long id, String Name, String address, long phone, double salary) {
		super(id,Name,address,phone);
		basicSalary = salary;
	}
	
	public double calculateTransportAllowance(double salary) {
		double transportAllowance = 15 * salary/100;
		return transportAllowance;
	}
}
