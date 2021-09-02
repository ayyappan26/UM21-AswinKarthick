package com.Collections;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * @author ashwin
 * 
 * 	Problem Statement 1:
1.	Develop a java class with a method storeEvenNumbers(int N) using ArrayList to store even numbers from 2 to N, where N is a integer which is passed as a parameter to the method storeEvenNumbers().  The method should return the ArrayList (A1) created. 
2.	In the same class create a method printEvenNumbers()which iterates through the arrayList A1 in step 1,  and It should multiply each number with 2 and display it in format 4,8,12….2*N. and add these numbers in a new ArrayList (A2). The new ArrayList (A2) created needs to be returned.
3.	Create a method retrieveEvenNumber(int N)  parameter is a number N. This method should search the arrayList (A1) for the existence of the number ‘N’ passed.  If exists it should return the Number else return zero.
Hint:  Use instance variable for storing the ArrayList A1 and A2.

NOTE: You can test the methods using a main method.

 *
 */
public class EvenArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of even numbers to be created");
		int num = sc.nextInt();

		StoreEvenNumbers(num);

	}

	public static ArrayList<Integer> StoreEvenNumbers(int N) {
		
		ArrayList<Integer> evearr = new ArrayList<Integer>();
		
		
		for(int i = 1; i <= N * 2; i++) {

			if (i % 2 == 0) {
				evearr.add(i);
			}
		}
		System.out.println(evearr);
		
		PrintEvenNumbers(evearr,N);
		
		
		return null;

	}
	
	public static ArrayList<Integer> PrintEvenNumbers(ArrayList<Integer> arr, int N){
		
		ArrayList<Integer> evearr1 = new ArrayList<Integer>();
		
		for(int i = 0 ; i < N ; i++) {
			
			evearr1.add(2 * arr.get(i));
			
		}
		
		System.out.println(evearr1);
		System.out.println(RetriveEvenNumbers(evearr1,N));
		
		return null;
		
	}
	
	public static int RetriveEvenNumbers(ArrayList<Integer> arr ,int N) {
		
		int ref = 0;
		for(int i =0 ; i < N ; i++) {
			
			if(arr.get(i) == N) {
				ref = N;
			}
		}
		return ref;
		
	}

}
