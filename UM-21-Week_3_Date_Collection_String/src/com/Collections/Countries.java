package com.Collections;

import java.util.HashSet;
import java.util.Scanner;

/**
 * @author ashwin
 * Problem Statement 2:
	1.	Develop a java class with a instance variable Country  HashSet (H1)  add a method storeCountryNames(String CountryName) , the method should add the passed country to a HashSet (H1) and return the added HashSet(H1).
	2.	Develop a method retrieveCountry(String CountryName) which iterates through the HashSet and returns the country if exist else return null.

	NOTE: You can test the methods using a main method.

 *
 */
public class Countries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet<String> country = new HashSet<String>();
		country.add("India");
		country.add("China");
		country.add("Italy");
		country.add("USA");
		country.add("Canada");
		
		System.out.println("Enter the country to be added ");
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		String ctr = sc.next();
		System.out.println(storeCountryNames(country,ctr));
		country = storeCountryNames(country,ctr);
		System.out.println("Enter the country to be searched ");
		String st = sc.next();
		System.out.println(retriveCountry(st,country));

	}
	
	public static HashSet<String> storeCountryNames(HashSet<String> hsstr,String str){
		
		hsstr.add(str);
		return hsstr;
	}
	
	public static String retriveCountry(String cn, HashSet<String> str) {
		
		String ref = null;
		if(str.contains(cn)) {
			ref = cn;
		}
		
		return ref;
	}

}
