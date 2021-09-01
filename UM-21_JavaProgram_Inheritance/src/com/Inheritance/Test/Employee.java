package com.Inheritance.Test;

public class Employee {
	long employeeid;
	String employeeName;
	String employeeAddress;
	long employeePhone;
	double basicSalary;
	double specialAllowance = 250.80;
	double Hra = 1000.50;
	
	public Employee(){
		
	}
	
	public Employee(long id, String Name, String address, long phone) {
		
		employeeid = id;
		employeeName = Name;
		employeeAddress = address;
		employeePhone = phone;
	}
	
	public double calculateSalary() {
		double Salary;
		Salary = basicSalary + (basicSalary * specialAllowance/100) + (basicSalary * Hra/100);
		//System.out.println("Salary = " + Salary);
		return Salary;
	}
	
	public double calculateTransportAllowance(double salary) {
		double transportAllowance;
		transportAllowance = 10.0/100.0 * salary;
		return transportAllowance;
	}
	
	
}


