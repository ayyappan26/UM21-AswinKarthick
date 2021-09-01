package com.Interface.Test;

public class KidUsers implements LibraryUser {
	
	int age;
	String bookType;

	public KidUsers(int age) {
		this.age = age;
	}
	
	public KidUsers(String bookType) {
		this.bookType = bookType;
	}
	
	public void registerAccount() {
		
		if(age < 12) {
			System.out.println("You have successfully registered under a kids account");
		}
		else {
			System.out.println("Sorry age must be less than 12 to register as a kid");
		}
			
	}

	public void requestBook() {
		
		if(bookType == "kids") {
			System.out.println("Book issued successfully, please return the book within 10 days ");
		}
		else {
			System.out.println("Oops, you are allowed to take only kids books");
		}
		
	}

}
