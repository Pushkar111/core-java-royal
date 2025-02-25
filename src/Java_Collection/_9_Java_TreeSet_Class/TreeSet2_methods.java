package Java_Collection._9_Java_TreeSet_Class;

import java.util.TreeSet;

public class TreeSet2_methods
{
	public static void main(String[] args)
	{
		TreeSet<Integer> ts1 = new TreeSet<Integer>();

		ts1.add(24);
		ts1.add(66);
		ts1.add(12);
		ts1.add(15);

		System.out.println("Lowest Value : " + ts1.pollFirst());
		System.out.println("Highest Value : " + ts1.pollLast());

		TreeSet<String> ts2 = new TreeSet<String>();
		ts2.add("A");
		ts2.add("B");
		ts2.add("C");
		ts2.add("D");
		ts2.add("E");
		System.out.println("Initial Set : " + ts2);

		System.out.println("Reverse Set : " + ts2.descendingSet());

		// here false - exclusive & true - inclusive
		System.out.println("Head Set : " + ts2.headSet("C", true));

		System.out.println("SubSet : " + ts2.subSet("A", false, "E", true));

		System.out.println("TailSet : " + ts2.tailSet("C", false));
	}
}
