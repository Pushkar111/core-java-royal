package Java_Collection._2_Java_ArrayList_Class.Tasks;

import java.util.ArrayList;
import java.util.LinkedHashSet;

public class _8_Remove_Duplicates_from_ArrayList
{
	public static void main(String[] args)
	{
		ArrayList<String> l1 = new ArrayList<String>();

		l1.add("Rahul");
		l1.add("Sagar");
		l1.add("Kunal");
		l1.add("Mehul");
		l1.add("Rahul");
		l1.add("Ghanshyam");
		l1.add("Keyur");
		l1.add("Rahul");
		l1.add("Kunal");

		System.out.println(l1);

		LinkedHashSet<String> hs1 = new LinkedHashSet<String>(l1);
		System.out.println(hs1);

	}
}
