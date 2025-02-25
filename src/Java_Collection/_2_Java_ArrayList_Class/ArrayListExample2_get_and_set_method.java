package Java_Collection._2_Java_ArrayList_Class;

import java.util.ArrayList;

public class ArrayListExample2_get_and_set_method
{
	public static void main(String[] args)
	{
		ArrayList<String> listObj = new ArrayList<String>();

		listObj.add("Rahul");
		listObj.add("Sagar");
		listObj.add("Kunal");
		listObj.add("Mehul");
		listObj.add("Ramesh");

//		get(int index) -> used to returns element at specific index
		System.out.println("--------------------------------------------------------------");
		System.out.println(listObj.get(0));
		System.out.println(listObj.get(1));
		System.out.println(listObj.get(2));
		System.out.println(listObj.get(3));
		System.out.println(listObj.get(4));

//		set(int index, String element) -> used to set element at require index
		System.out.println("--------------------------------------------------------------");
		listObj.set(2, "Ram");

		for (String str : listObj)
		{
			System.out.println(str);
		}

	}
}
