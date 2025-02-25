package Java_Collection._8_Java_LinkedHashSet_Class;

import java.util.LinkedHashSet;

public class LinkedHashSet1
{
	public static void main(String[] args)
	{
		LinkedHashSet<String> lhs = new LinkedHashSet<String>();

		lhs.add("Rahul");
		lhs.add("Teena");
		lhs.add("Sagar");
		lhs.add("Fenil");
		lhs.add("Viral");
		lhs.add("Rahul");

		System.out.println("LinkedHashSet : " + lhs);

		lhs.forEach(str -> {
			System.out.println(str);
		});
	}
}
