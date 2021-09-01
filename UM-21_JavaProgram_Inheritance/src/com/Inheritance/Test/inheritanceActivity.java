package com.Inheritance.Test;

public class inheritanceActivity {

	public static void main(String[] args) {
		
		Manager manobj = new Manager(126534,"Peter","Chennai India",237844,65000);
		System.out.println("Manager Salary is " + manobj.calculateSalary());
		
		Trainee trobj = new Trainee(29846,"Jack","Mumbai India",442085,45000);
		System.out.println("Trainee Salary is "+ trobj.calculateSalary());
		
		System.out.println("Travel Allowance of Manager is " + manobj.calculateTransportAllowance(65000));
		System.out.println("Travel Allowance of Trainee is " + trobj.calculateTransportAllowance(45000));
	}

}
