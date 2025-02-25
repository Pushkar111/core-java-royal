package Java_Collection._8_Java_LinkedHashSet_Class;

import java.util.LinkedHashSet;

public class LinkedHashSet2_methods
{
	public static void main(String[] args)
	{
		LinkedHashSet<String> lhs1 = new LinkedHashSet<String>();

		lhs1.add("Rahul");
		lhs1.add("Sagar");
		lhs1.add("Keyur");
		lhs1.add("Hetul");
		lhs1.add("Viral");
		lhs1.add("Rahul");

		System.out.println("An initial list of elements : " + lhs1);

		lhs1.remove("Hetul");
		System.out.println("After invoking remove(object) method : " + lhs1);

		LinkedHashSet<String> lhs2 = new LinkedHashSet<String>();

		lhs2.add("Ghanshyam");
		lhs2.add("Fenil");
		lhs2.add("Sagar");

		lhs1.addAll(lhs2);

		System.out.println("After invoking addAll() method : " + lhs1);

		lhs1.removeAll(lhs2);
		System.out.println("After invoking removeAll() method : " + lhs1);

		// Removing elements on the basis of specified condition
		lhs1.removeIf(str -> str.contains("Keyur"));
		System.out.println("After invoking removeIf() method: " + lhs1);

		// Removing all the elements available in the set
		lhs1.clear();
		System.out.println("After invoking clear() method: " + lhs1);
	}
}
