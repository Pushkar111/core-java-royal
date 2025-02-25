package Java_Collection._9_Java_TreeSet_Class;

import java.util.TreeSet;

public class TreeSet1
{
	public static void main(String[] args)
	{
		TreeSet<String> ts = new TreeSet<String>();

		ts.add("Rahul");
		ts.add("Sagar");
		ts.add("Jagdish");
		ts.add("Mehul");
		ts.add("Viral");
		ts.add("Rahul");

		System.out.println("TreeSet : " + ts);

		ts.forEach(str -> {
			System.out.println(str);
		});

	}
}
