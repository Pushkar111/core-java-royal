package Java_Collection._2_Java_ArrayList_Class;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class ArrayListExample1_AllWays_to_iterate
{
	public static void main(String[] args)
	{
		/*
			  ⦿ Ways to iterate the elements of the collection in Java
			  ---------------------------------------------------------- 
			  -> There are various ways to traverse the collection elements:
			  
			  1) By Iterator interface.(Traditional Way) 
			  2) By for loop. 
			  3) By for-each loop. 
			  4) By ListIterator interface.[Reverse interate] 
			  5) By forEach() method.
			  6) By forEachRemaining() method.
		*/
		ArrayList<String> listObj = new ArrayList<String>();

		listObj.add("Rahul");
		listObj.add("Sagar");
		listObj.add("Kunal");
		listObj.add("Mehul");
		listObj.add("Ramesh");

		System.out.println("ArrayList : " + listObj);

		System.out.println("Different Ways to iterating ArrayList : ");

		System.out.println("---------------------------------------------------------------------------------");
		System.out.println("1) First Way to interate listObj (Traditional Way)");
		Iterator<String> itr1 = listObj.iterator();
		while (itr1.hasNext())
		{
			String str = (String) itr1.next();
			System.out.println(str);
		}

		System.out.println("---------------------------------------------------------------------------------");
		System.out.println("2) Second Way to interate listObj using Simple for loop");
		for (int i = 0; i < listObj.size(); i++)
		{
			// DownCasting not Require [bcz of Generic]
			String str = listObj.get(i);
			System.out.println(str);
		}

		System.out.println("---------------------------------------------------------------------------------");
		System.out.println("3) Third Way to interate listObj using Simple forEach loop");
		for (String str : listObj)
		{
			System.out.println(str);
		}

		System.out.println("---------------------------------------------------------------------------------");
		System.out.println("4) Fourth Way to interate listObj using ListIterator [Reverse interate]");
		ListIterator<String> itr4 = listObj.listIterator(listObj.size());
		while (itr4.hasPrevious())
		{
			String str = itr4.previous();
			System.out.println(str);
		}

		System.out.println("---------------------------------------------------------------------------------");
		System.out.println("5) Fifth way to interate listObj using forEach() method:");
		// The forEach() method is a new feature, introduced in Java 8.
		listObj.forEach(str -> { // Here, we are using lambda expression
			System.out.println(str);
		});

		System.out.println("---------------------------------------------------------------------------------");
		System.out.println("6) Sixth way to interate listObj using forEachRemaining() method:");
		Iterator<String> itr5 = listObj.iterator();
		itr5.forEachRemaining(str -> {
			System.out.println(str);
		});

	}
}
