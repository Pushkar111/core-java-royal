package Array.Arr1D;

import java.util.Scanner;

public class TestArr1D
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		int SIZE = 5;
		int a[] = new int[SIZE];

		Scanner sc = new Scanner(System.in);

		for (int i = 0; i < a.length; i++)
		{
			System.out.print("Enter the value of a[" + i + "] : ");
			a[i] = sc.nextInt();
		}

		for (int i = 0; i < a.length; i++)
		{
			System.out.println("a[" + i + "] : " + a[i]);
		}

	}

}
