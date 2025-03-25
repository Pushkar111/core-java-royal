package Array.Java_Arrays_Class;

import java.util.Arrays;

public class ArraysDemo3
{
	public static void main(String[] args)
	{
		int SIZE = 5;
		int a[] = new int[SIZE];

		// set all elements to 10
		Arrays.fill(a, 10);
		System.out.println(Arrays.toString(a));

		// set 1 to 3 index elements to 50
		Arrays.fill(a, 1, 4, 50);
		System.out.println(Arrays.toString(a));

		
		
		
		
		// Filling String Array
		String[] names = new String[SIZE];

		Arrays.fill(names, "Unknown");
		System.out.println(Arrays.toString(names));

		Arrays.fill(names, 0, 2, "known");
		System.out.println(Arrays.toString(names));

	}
}
