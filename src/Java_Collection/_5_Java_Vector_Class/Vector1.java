package Java_Collection._5_Java_Vector_Class;

import java.util.Vector;

public class Vector1
{
	public static void main(String[] args)
	{
		Vector<String> v = new Vector<String>();

		v.add("Rahul");
		v.add("Sagar");
		v.add("Kunal");
		v.add("Shekar");
		v.add("Viral");
		v.add("Rahul");

		System.out.println("Vector : " + v);

		System.out.println();

		v.forEach(str -> {
			System.out.println(str);
		});
	}
}
