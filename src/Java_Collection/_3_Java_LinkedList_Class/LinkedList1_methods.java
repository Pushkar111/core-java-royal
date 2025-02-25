package Java_Collection._3_Java_LinkedList_Class;

import java.util.LinkedList;

public class LinkedList1_methods
{
	public static void main(String[] args)
	{
		LinkedList<String> l1 = new LinkedList<String>();

		l1.add("Rahul");
		l1.add("Sagar");
		l1.add("Mohit");
		l1.add("Kishan");
		l1.add("Kunal");
		l1.add("Rahul");

		l1.forEach(str -> {
			System.out.println(str);
		});

		System.out.println("----------------------------------------------------------------------------------------");
		LinkedList<String> l2 = new LinkedList<String>();

		System.out.println("Initial list of elements: " + l2);

		l2.add("Ravi");
		l2.add("Vijay");
		l2.add("Ajay");

		System.out.println("After invoking add(E e) method: " + l2);

		// Adding an element at the specific position
		l2.add(1, "Gaurav");
		System.out.println("After invoking add(int index, E element) method: " + l2);

		System.out.println("----------------------------------------------------------------------------------------");
		LinkedList<String> l3 = new LinkedList<String>();
		l3.add("Sonoo");
		l3.add("Hanumat");
		// Adding third list elements to the second list
		l2.addAll(l3);
		System.out.println("After invoking addAll(Collection<? extends E> c) method: " + l2);

		System.out.println("----------------------------------------------------------------------------------------");
		LinkedList<String> l4 = new LinkedList<String>();

		l4.add("John");
		l4.add("Rahul");

		// Adding second list elements to the first list at specific position
		l2.addAll(1, l4);
		System.out.println("After invoking addAll(int index, Collection<? extends E> c) method: " + l2);

		System.out.println("----------------------------------------------------------------------------------------");
		// Adding an element at the first position
		l2.addFirst("Lokesh");
		System.out.println("After invoking addFirst(E e) method: " + l2);
		// Adding an element at the last position
		l2.addLast("Harsh");
		System.out.println("After invoking addLast(E e) method: " + l2);

	}
}
