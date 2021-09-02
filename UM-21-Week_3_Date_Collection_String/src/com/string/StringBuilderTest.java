package com.string;

public class StringBuilderTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "C:\\IBM\\DB2\\PROGRAM\\DB2COPY1.EXE";
		String[] arr = str.split("\\\\");
		System.out.println("Drive " + arr[0]);
		System.out.println("Folders " + arr[1] + "||" + arr[2] + "||" + arr[3]);
		System.out.println("File " + arr[4]);

	}

}
