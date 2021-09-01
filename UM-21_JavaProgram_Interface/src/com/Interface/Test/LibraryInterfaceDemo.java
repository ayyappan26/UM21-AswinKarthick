package com.Interface.Test;

public class LibraryInterfaceDemo {

	public static void main(String[] args) {

		KidUsers kidage1 = new KidUsers(10);
		KidUsers kidage2 = new KidUsers(18);
		KidUsers kidbook1 = new KidUsers("kids");
		KidUsers kidbook2 = new KidUsers("fiction");
		kidage1.registerAccount();
		kidage2.registerAccount();
		kidbook1.requestBook();
		kidbook2.requestBook();
		
		AdultUsers adultage1 = new AdultUsers(5);
		AdultUsers adultage2 = new AdultUsers(23);
		AdultUsers adultbook1 = new AdultUsers("kids");
		AdultUsers adultbook2 = new AdultUsers("fiction");
		adultage1.registerAccount();
		adultage2.registerAccount();
		adultbook1.requestBook();
		adultbook2.requestBook();
	}

}
