package Array.Arr1D;

import java.util.Scanner;

public class TestArr1D
{

	public static void main(String[] args)
	{
		int SIZE = 5;
		int a[] = new int[SIZE];

		Scanner sc = new Scanner(System.in);

		for (int i = 0; i < a.length; i++)
		{
			System.out.print("Enter the value of a[" + i + "] : ");
			a[i] = sc.nextInt();
		}

		// Simple For Loop
		for (int i = 0; i < a.length; i++)
		{
			System.out.print(a[i] + " ");
		}

		System.out.println();

		// Simple For Loop Reversed
		for (int i = a.length; i > 0; i--)
		{
			System.out.print(i + " ");
		}

		System.out.println();
		// ForEach Loop
		for (int e : a)
		{
			System.out.print(e + " ");
		}

	}

}
