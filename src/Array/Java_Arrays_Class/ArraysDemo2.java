package Array.Java_Arrays_Class;

import java.util.Arrays;

public class ArraysDemo2
{
	public static void main(String[] args)
	{
		int a[] = { 1, 2, 3, 4, 5 };
		int b[] = { 1, 2, 3, 4, 5 };
		int c[] = { 1, 2, 3, 4, 5, 21 };

		boolean isEqual;
		isEqual = Arrays.equals(a, b);
		System.out.println(isEqual);

		isEqual = Arrays.equals(a, c);
		System.out.println(isEqual);

	}
}
