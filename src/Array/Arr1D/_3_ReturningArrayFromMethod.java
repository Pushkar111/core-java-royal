package Array.Arr1D;

import java.util.Arrays;
import java.util.Scanner;

public class _3_ReturningArrayFromMethod
{
	public static int[] scanData()
	{
		Scanner sc = new Scanner(System.in);

		int a[] = new int[5];

		for (int i = 0; i < a.length; i++)
		{
			System.out.println("Enter the value of [" + i + "] : ");
			a[i] = sc.nextInt();
		}

		return a;
	}

	public static void main(String[] args)
	{
		int a[] = scanData();

		System.out.println(Arrays.toString(a));
	}
}
