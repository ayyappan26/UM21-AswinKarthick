package com.Collections;

import java.util.HashMap;

/**
 * @author ashwin
 * 
 * Problem Statement 3:
1.	Develop a java class with a instance variable CountryMap  HashMap (M1)  add a method storeCountryCapital(String CountryName, String capital) , the method should add the passed country and capital as key/value in the map M1 and return the Map (M1).
Key- Country	Value - Capital
India	Delhi
Japan	Tokyo

2.	Develop a method retrieveCapital(String CountryName) which returns the capital for the country passed from the Map M1 created in step 1.
3.	Develop a method retrieveCountry(String capitalName) which returns the country for the capital name passed from the Map M1 created in step 1.
4.	Develop a method which iterates through the map M1 and creates another map M2 with Capital as the key and value as Country and returns the Map M2.
Key - Capital	Value – Country
Delhi	India
Tokyo	Japan
1.	Develop a method which iterates through the map M1 and creates a ArrayList with all the Country names stored as keys. This method should return the ArrayList.

 *
 */
public class MapsOperations {

	static HashMap<String,String> countryMap = new HashMap<String,String>();
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		countryMap.put("India", "Delhi");
		countryMap.put("Japan", "Tokyo");
		
		storeCountryCapital("Germany","Berlin");
		retriveCapital("Japan");
		swapCountryCapital();

	}
	
	public static void storeCountryCapital(String country, String capital) {
		countryMap.put(country, capital);
	}
	
	public static void retriveCapital(String country) {
		//System.out.println(countryMap.get(country));
	}
	
	public static void swapCountryCapital(){
		
		HashMap<Object,Object> rev = new HashMap<Object,Object>();
		for(@SuppressWarnings("rawtypes") 
		HashMap.Entry m : countryMap.entrySet()){    
		    System.out.println(m.getKey()+" "+m.getValue());   
		    rev.put(m.getValue(), m.getKey());
		   }
		System.out.println();
		System.out.println(rev);
	}

}
