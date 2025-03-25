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

public class DateDemo2
{
	public static void main(String[] args)
	{
		Date d1 = new Date();
		Date d2 = new Date(System.currentTimeMillis() - 100000); // 100 Seconds Earlier
		Date d3 = new Date(System.currentTimeMillis() + 100000); // 100 Seconds After

		System.out.println("Date1 : " + d1);
		System.out.println("Date2 : " + d2);
		System.out.println("Date3 : " + d3);

		System.out.println("Date1 After Date2? : " + d1.after(d2)); // true
		System.out.println("Date1 After Date2? : " + d1.after(d3)); // false

		System.out.println("Date1 before Date2? : " + d1.before(d2)); // false
		System.out.println("Date1 before Date2? : " + d1.before(d3)); // true

		System.out.println("Date1 compareTo Date2? : " + d1.compareTo(d2)); // if Equal -> 0, After -> 1, Before -> -1
		System.out.println("Date1 compareTo Date2? : " + d1.compareTo(d3)); // if Equal -> 0, After -> 1, Before -> -1

		Date date1 = new Date();
		Date date2 = new Date();
		System.out.println("Date1 compareTo Date2? : " + date1.compareTo(date2)); // if Equal -> 0, After -> 1, Before -> -1

	}
}
