package Java_Collection._2_Java_ArrayList_Class;

import java.util.ArrayList;

public class ArrayListExample8_SizeCapacity
{
	public static void main(String[] args)
	{
		ArrayList<String> listObj1 = new ArrayList<String>();
		System.out.println("Size of listObj1 : " + listObj1.size());

		ArrayList<String> listObj2 = new ArrayList<String>(3);
		System.out.println("Size of listObj2 : " + listObj2.size());
	}
}
