package com.assignment.date;

import java.text.SimpleDateFormat;
import java.util.Date;


/**
 * 	@author ashwin
 * 
 *	Display the current system date in different formats
 */
public class DateDisplay {

	public static void main(String[] args) {

		Date dobj = new Date();
		System.out.println(dobj);
		SimpleDateFormat sf = new SimpleDateFormat("MM/dd/YY h:m a");
		String str = sf.format(dobj);
		System.out.println(str);
		sf = new SimpleDateFormat("h:m:s a");
		str = sf.format(dobj);
		System.out.println(str);
		sf = new SimpleDateFormat("MMM d, YYYY h:m:s a");
		str = sf.format(dobj);
		System.out.println(str);
		sf = new SimpleDateFormat("h:m a");
		str = sf.format(dobj);
		System.out.println(str);
		sf = new SimpleDateFormat("h:m:s a z");
		str = sf.format(dobj);
		System.out.println(str);
		sf = new SimpleDateFormat("MMM d, YYYY h:m a");
		str = sf.format(dobj);
		System.out.println(str);
		sf = new SimpleDateFormat("MMMMM d, YYYY h:m:s a z");
		str = sf.format(dobj);
		System.out.println(str);
		
		
		
	}

}
