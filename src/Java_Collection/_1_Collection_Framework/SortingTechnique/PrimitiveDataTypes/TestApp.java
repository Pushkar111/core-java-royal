package Java_Collection._1_Collection_Framework.SortingTechnique.PrimitiveDataTypes;

import java.util.ArrayList;
import java.util.Collections;

public class TestApp
{
	public static void main(String[] args)
	{
		ArrayList<String> listObj = new ArrayList<String>();

		listObj.add("Rahul");
		listObj.add("Sagar");
		listObj.add("Mehul");
		listObj.add("Kunal");
		listObj.add("Lalit");

		System.out.println("Before Sorting");
		System.out.println("---------------------------");
		for (String str : listObj)
		{
			System.out.println(str);
		}

		Collections.sort(listObj);
		System.out.println("After Sorting");
		System.out.println("---------------------------");
		for (String str : listObj)
		{
			System.out.println(str);
		}
	}
}
