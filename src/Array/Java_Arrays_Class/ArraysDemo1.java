package Array.Java_Arrays_Class;

import java.util.Arrays;

public class ArraysDemo1
{
	public static void main(String[] args)
	{
		String[] countries = { "Poland", "Nepal", "India", "Austria", "Japan", "Bhutan", "Canada", "France", "China", "Italy", "Germany" };

//		System.out.println("Before Sorting .... ");
//		for (String country : countries)
//		{
//			System.out.println(country);
//		}

//		Arrays.sort(countries);
//		System.out.println("After Sorting .... ");
//		for (String country : countries)
//		{
//			System.out.println(country);
//		}

//		Arrays.sort(countries, 0, 3); // sort 0 to 2 index -- (Object[] a, int fromIndex, int toIndex)
//		System.out.println("After 0[inclusive], 3[exclusive] Sorting .... ");
//		for (String country : countries)
//		{
//			System.out.println(country);
//		}

		// toString --> representation in String format
//		System.out.println(Arrays.toString(countries));

		// Before performing binarySearch we must sort the array
		Arrays.sort(countries);
		System.out.println(Arrays.toString(countries));

		// binarySearch(array, key)
		int indiaIndex = Arrays.binarySearch(countries, "India");
		System.out.println("India is Found at index : " + indiaIndex);

	}
}
