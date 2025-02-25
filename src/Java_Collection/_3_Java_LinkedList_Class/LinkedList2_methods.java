package Java_Collection._3_Java_LinkedList_Class;

import java.util.LinkedList;

public class LinkedList2_methods
{
	public static void main(String[] args)
	{
		LinkedList<String> l1 = new LinkedList<String>();

		l1.add("Ravi");
		l1.add("Vijay");
		l1.add("Ajay");
		l1.add("Anuj");
		l1.add("Gaurav");
		l1.add("Harsh");
		l1.add("Virat");
		l1.add("Gaurav");
		l1.add("Harsh");
		l1.add("Amit");

		System.out.println("Initial list of elements: " + l1);

		// Removing specific element from arraylist
		l1.remove("Vijay");
		System.out.println("After invoking remove(object) method: " + l1);

		// Removing element on the basis of specific position
		l1.remove(0);
		System.out.println("After invoking remove(index) method: " + l1);

// ------------------------------------------------------------------------------------------------
		LinkedList<String> l2 = new LinkedList<String>();
		l2.add("Ravi");
		l2.add("Hanumat");

		// Adding new elements to arraylist
		l1.addAll(l2);
		System.out.println("Updated list : " + l1);

		// Removing all the new elements from arraylist
		l1.removeAll(l2);
		System.out.println("After invoking removeAll() method: " + l1);

		// Removing first element from the list
		l1.removeFirst();
		System.out.println("After invoking removeFirst() method: " + l1);

		// Removing Last element from the list
		l1.removeLast();
		System.out.println("After invoking removeLast() method: " + l1);

		// Removing first occurrence of element from the list
		l1.removeFirstOccurrence("Gaurav");
		System.out.println("After invoking removeFirstOccurrence() method: " + l1);

		// Removing last occurrence of element from the list
		l1.removeLastOccurrence("Harsh");
		System.out.println("After invoking removeLastOccurrence() method: " + l1);

		// Removing all the elements available in the list
		l1.clear();
		System.out.println("After invoking clear() method: " + l1);
	}
}
