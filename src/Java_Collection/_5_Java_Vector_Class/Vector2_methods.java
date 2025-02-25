package Java_Collection._5_Java_Vector_Class;

import java.util.Vector;

public class Vector2_methods
{
	public static void main(String[] args)
	{
		Vector<String> v = new Vector<String>();

		v.add("Rahul");
		v.add("Sagar");
		v.add("Hetul");
		v.add("Fenil");
		v.add("Viral");
		v.add("Rahul");

		// Check size and capacity
		System.out.println("size() : " + v.size());
		System.out.println("Default Capacity : " + v.capacity()); // 10

		// Display
		System.out.println("Vector : " + v);

		v.addElement("Ghanshyam");
		v.addElement("Jogi");
		v.addElement("Shita");

		// Again check size and capacity after Three insertions
		System.out.println("size() : " + v.size());
		System.out.println("After Addition Capacity : " + v.capacity()); // 10

		// Display Vector elements again
		System.out.println("Vector : " + v);

		// Check 'Fenil' is present in the Vector or not
		if (v.contains("Fenil"))
		{
			System.out.println("'Fenil' found!");
		} else
		{
			System.out.println("'Fenil' not found!");
		}

		// Get First Element
		System.out.println("First Element is : " + v.firstElement());

		// Get Last Element
		System.out.println("Last Element is : " + v.lastElement());
	}
}
