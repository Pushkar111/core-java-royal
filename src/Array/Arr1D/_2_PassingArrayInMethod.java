package Array.Arr1D;

import java.util.Scanner;

public class _2_PassingArrayInMethod
{

	public static void findMin(int a[])
	{
		int min = a[0];

		for (int i = 0; i < a.length; i++)
		{
			if (a[i] < min)
			{
				min = a[i];
			}
		}

		System.out.println("Minimum element: " + min);
	}

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);

		int a[] = new int[5];

		for (int i = 0; i < a.length; i++)
		{
			System.out.println("Enter the value of [" + i + "] : ");
			a[i] = sc.nextInt();
		}

		findMin(a);
	}
}
