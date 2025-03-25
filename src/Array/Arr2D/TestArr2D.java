package Array.Arr2D;

import java.util.Scanner;

public class TestArr2D
{

	public static void main(String[] args)
	{
		int ROW = 3, COL = 3;
		int a[][] = new int[ROW][COL];

		Scanner sc = new Scanner(System.in);

		for (int i = 0; i < ROW; i++)
		{
			for (int j = 0; j < COL; j++)
			{
				System.out.print("Enter the value of a[" + i + "][" + j + "] : ");
				a[i][j] = sc.nextInt();
			}
		}

		System.out.println("Matrix A");
		System.out.println("--------------------------------");
		for (int i = 0; i < ROW; i++)
		{
			for (int j = 0; j < COL; j++)
			{
				System.out.print(a[i][j] + "\t");
			}
			System.out.println();
		}

	}

}
