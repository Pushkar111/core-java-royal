package Java_Collection._7_Java_HashSet_Class;

import java.util.HashSet;

public class HashSet2_methods
{
	public static void main(String[] args)
	{
		HashSet<String> hs1 = new HashSet<String>();

		hs1.add("Rahul");
		hs1.add("Sagar");
		hs1.add("Keyur");
		hs1.add("Hetul");
		hs1.add("Viral");
		hs1.add("Rahul");

		System.out.println("An initial list of elements : " + hs1);

		hs1.remove("Hetul");
		System.out.println("After invoking remove(object) method : " + hs1);

		HashSet<String> hs2 = new HashSet<String>();

		hs2.add("Ghanshyam");
		hs2.add("Fenil");
		hs2.add("Sagar");

		hs1.addAll(hs2);

		System.out.println("After invoking addAll() method : " + hs1);

		hs1.removeAll(hs2);
		System.out.println("After invoking removeAll() method : " + hs1);

		// Removing elements on the basis of specified condition
		hs1.removeIf(str -> str.contains("Keyur"));
		System.out.println("After invoking removeIf() method: " + hs1);

		// Removing all the elements available in the set
		hs1.clear();
		System.out.println("After invoking clear() method: " + hs1);
	}
}
