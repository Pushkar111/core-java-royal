package Java_Collection._7_Java_HashSet_Class;

import java.util.HashSet;

public class HashSet1
{
	public static void main(String[] args)
	{
		HashSet<String> hs = new HashSet<String>();

		hs.add("Rahul");
		hs.add("Sagar");
		hs.add("Hetul");
		hs.add("Viral");
		hs.add("Fenil");
		hs.add("Rahul");

		System.out.println("HashSet : " + hs);

		hs.forEach(str -> {
			System.out.println(str);
		});
	}
}
