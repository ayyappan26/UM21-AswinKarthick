package com.string;

public class StringBufferTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuffer str = new StringBuffer("This is StringBuffer");
		str.append(" - This is a sample program");
		System.out.println(str);
		str.insert(21,"Object");
		System.out.println(str);
		str.reverse();
		System.out.println(str);
		str.reverse();
		str.replace(14,21,"Builder");
		System.out.println(str);
		

	}

}
