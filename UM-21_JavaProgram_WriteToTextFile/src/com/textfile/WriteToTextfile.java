package com.textfile;

import java.io.FileWriter;
import java.io.IOException;

public class WriteToTextfile {

	public static void main(String[] args) {
		
		try{
			FileWriter fw = new FileWriter("D:\\hello.txt");
			fw.write("Hello, Welcome to my text file program");
			fw.write("\nThis is the second line");
			fw.close();
		}catch(IOException e) {
			System.out.println("File not Fot Found");
		}
		
	}

}
