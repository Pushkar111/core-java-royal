package Java_Collection._2_Java_ArrayList_Class;

import java.util.ArrayList;

public class ArrayListExample6_isEmpty
{
	public static void main(String[] args)
	{
		ArrayList<String> listObj = new ArrayList<String>();

		System.out.println("Is ArrayList Empty: " + listObj.isEmpty());

		listObj.add("Ravi");
		listObj.add("Vijay");
		listObj.add("Ajay");

		System.out.println("After Insertion");
		System.out.println("Is ArrayList Empty: " + listObj.isEmpty());
	}
}
