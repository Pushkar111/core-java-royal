package Java_Date_Class;

import java.util.Date;

/*
Important Methods

Method	Description
getTime()			Returns the number of milliseconds since Jan 1, 1970 (Epoch time).
after(Date d)		Checks if the current date is after the given date.
before(Date d)		Checks if the current date is before the given date.
compareTo(Date d)	Compares two dates. Returns 0 if equal, a positive value if after, and a negative value if before.

*/

public class DateDemo1
{
	public static void main(String[] args)
	{
		Date d1 = new Date();
		System.out.println("Current Date and Time is " + d1);
	}
}
