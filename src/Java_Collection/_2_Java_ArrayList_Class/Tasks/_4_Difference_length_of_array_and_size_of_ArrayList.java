package Java_Collection._2_Java_ArrayList_Class.Tasks;

import java.util.ArrayList;

public class _4_Difference_length_of_array_and_size_of_ArrayList
{
	public static void main(String[] args)
	{
		// creating array of 10 elements
		int arr[] = new int[10];

		// storing 2 elements
		arr[0] = 10;
		arr[1] = 12;

		// printing length of array
		System.out.println(arr.length);// 10

		// Creating ArrayList
		ArrayList<String> list = new ArrayList<String>();

		// storing 2 elements
		list.add("ankit");
		list.add("nippun");

		// printing size of ArrayList
		System.out.println(list.size());// 2

	}
}
