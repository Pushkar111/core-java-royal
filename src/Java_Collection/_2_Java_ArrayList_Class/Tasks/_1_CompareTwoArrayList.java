package Java_Collection._2_Java_ArrayList_Class.Tasks;

import java.util.ArrayList;
import java.util.Scanner;

/*
 * Q. How to Compare Two ArrayList in Java
 * -----------------------------------------
 * -> There are following ways to compare two ArrayList in Java:
 *        1) Java equals() method
 *        		-> Syntax : 
 *        			boolean equals(Object o)  
 *        2) Java removeAll() method                              
 *        		-> Syntax : 
 *        			public boolean removeAll(Collection<?>  c)  
 *        3) Java retainAll() method                              
 *        		-> Syntax : 
 *        			public boolean retainAll(Collection<?> c) 
 *        4) Java ArrayList.contains() method                     
 *        		-> Syntax : 
 *        			public boolean  contains(Object o)  
 *        5) Java contentEquals() method                          
 *        		-> Syntax : 
 *        			public boolean contentEquals(StringBuffer sb)  
 * */

public class _1_CompareTwoArrayList
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		ArrayList<String> listObj1 = new ArrayList<String>();

		listObj1.add("Rahul");
		listObj1.add("sagar");
		listObj1.add("Kunal");
		listObj1.add("Mehul");
		listObj1.add("Ram");

		System.out.println(listObj1);
// -------------------------------------------------------------------------------
		ArrayList<String> listObj2 = new ArrayList<String>();

		listObj2.add("Rahul");
		listObj2.add("sagar");
		listObj2.add("Kunal");
		listObj2.add("Mehul");
		listObj2.add("Ram");

		System.out.println(listObj2);

		while (true)
		{
			System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
			System.out.println("        Ways To Compare Two ArrayList    ");
			System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
			System.out.println("1) Java equals() method                 ");
			System.out.println("2) Java removeAll() method              ");
			System.out.println("3) Java retainAll() method              ");
			System.out.println("4) Java ArrayList.contains() method     ");
			System.out.println("5) Java contentEquals() method          ");
			System.out.println("6) Exit");
			System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");

			System.out.println("Enter choice : ");
			int choice = sc.nextInt();

			switch (choice)
			{
			case 1:
				// -------------------------------------------------------------------------------
				// comparing both lists
				boolean value = listObj1.equals(listObj2);
				System.out.println(value);
				// -------------------------------------------------------------------------------
				// After Adding another value in listObj2
				listObj2.add("Keyur");
				boolean valueEdited = listObj1.equals(listObj2);
				System.out.println(valueEdited);
				break;

			case 2:
				// removes all elements from the first list
				// returns empty list if all the elements of first list match with elements of
				// second list
				listObj2.removeAll(listObj1);
				// prints the element of second list which does not match with the element of
				// the first list
				System.out.println(listObj2);
				break;

			case 3:
				// returns the common elements in both list
				listObj1.retainAll(listObj1);
				System.out.println("Common elements in both list: ");
				System.out.println(listObj2);
				break;

			case 4:
				/*
				 * if elements of listObj1 in contains listObj2 then print 'Yes' else 'No' in
				 * new listObj3
				 */
				// storing the comparison output in thirdList
				ArrayList<String> listObj3 = new ArrayList<String>();
				// iterator using for-each loop
				for (String str : listObj1)
				{
					listObj3.add(listObj2.contains(str) ? "Yes" : "No");
				}
				System.out.println(listObj3);
				break;

			case 5:
				System.out.println("When Lists are same: " + compareList(listObj1, listObj2));
				// adding another element to the secondList
				listObj2.add("C++");
				// output after adding different element
				System.out.println("When Lists are not same: " + compareList(listObj1, listObj2));
				break;

			case 6:
				exitAppication();
				break;

			default:
				System.out.println("Invalid choice!");
				break;
			}

		}
	}

	// case-5 : contentEquals()
	private static boolean compareList(ArrayList<String> listObj1, ArrayList<String> listObj2)
	{
		return listObj1.toString().contentEquals(listObj2.toString()) ? true : false;
	}

	// case-6 : exit
	private static void exitAppication()
	{
		try
		{
			Thread.sleep(500);
		} catch (Exception e)
		{
			e.printStackTrace();
		}
		System.out.println("======================== Application Closed Successfully ========================");
		System.exit(0);
	}
}
