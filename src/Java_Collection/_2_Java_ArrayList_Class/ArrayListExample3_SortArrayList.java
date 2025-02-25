package Java_Collection._2_Java_ArrayList_Class;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListExample3_SortArrayList
{
	public static void main(String[] args)
	{
		/* Creating list of String */
		ArrayList<String> listObj = new ArrayList<String>();

		listObj.add("Rahul");
		listObj.add("Sagar");
		listObj.add("Kunal");
		listObj.add("Mehul");
		listObj.add("Ramesh");

		System.out.println("Before Sorting : ");
		System.out.println("------------------------------------------------");
		for (String str : listObj)
		{
			System.out.println(str);
		}

		// Collections.sort() -> used to sort the list
		Collections.sort(listObj);

		System.out.println("\nAfter Sorting : ");
		System.out.println("------------------------------------------------");
		for (String str : listObj)
		{
			System.out.println(str);
		}

		/* Creating list of Integer */
		ArrayList<Integer> listObj2 = new ArrayList<Integer>();

		listObj2.add(5);
		listObj2.add(4);
		listObj2.add(3);
		listObj2.add(2);
		listObj2.add(1);

		System.out.println("\nBefore Sorting : ");
		System.out.println("------------------------------------------------");
		for (Integer integer : listObj2)
		{
			System.out.println(integer);
		}

		Collections.sort(listObj2);

		System.out.println("\nAfter Sorting : ");
		System.out.println("------------------------------------------------");
		for (Integer integer : listObj2)
		{
			System.out.println(integer);
		}

	}
}
