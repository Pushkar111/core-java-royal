package Java_Collection._2_Java_ArrayList_Class.Tasks;

import java.util.ArrayList;

/*
===> Array vs ArrayList in Java
---------------------------------
-> Array is a fixed length data structure whereas ArrayList is a variable length Collection class. 
-> We cannot change length of array once created in Java but ArrayList can be changed.
-> We cannot store primitives in ArrayList, it can only store objects. 
   But array can contain both primitives and objects in Java.
*/
public class _6_Array_vs_ArrayList
{
	public static void main(String[] args)
	{
		ArrayList<Integer> list = new ArrayList<>();
		// primitive -> Wrapper Class
		// Auto Boxing
		list.add(Integer.valueOf(10));// storing Integer object
		list.add(20);// Now compiler converts it into Integer.valueOf(20) which is object
		list.add(30);

		for (Integer i : list)
		{
			System.out.println(i);
		}
	}
}
