package Java_Collection._3_Java_LinkedList_Class;

import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;

public class LinkedList3_Reverse_List
{
	public static void main(String[] args)
	{
		LinkedList<String> l1 = new LinkedList<String>();

		l1.add("Rahul");
		l1.add("Viral");
		l1.add("Binoy");
		l1.add("Parthiv");
		l1.add("Sagar");

// ------------------------------------------------------------------------------------
		System.out.println("1) using Collections.reverse()");
		System.out.println("----------------------------------------------------");
		Collections.reverse(l1);

		l1.forEach(str -> {
			System.out.println(str);
		});
// ------------------------------------------------------------------------------------
		Collections.reverse(l1);
		System.out.println("2) using decendingIterator()");
		System.out.println("----------------------------------------------------");
		Iterator<String> itr = l1.descendingIterator();
		while (itr.hasNext())
		{
			System.out.println(itr.next());
		}

	}
}
