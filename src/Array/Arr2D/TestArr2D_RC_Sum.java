package Array.Arr2D;

import java.util.Scanner;

public class TestArr2D_RC_Sum
{
	public static void main(String args[])
	{
		int ROW = 3, COL = 3;

		int a[][] = new int[ROW][COL];

		Scanner sc = new Scanner(System.in);

		for (int i = 0; i < ROW; i++)
		{
			for (int j = 0; j < COL; j++)
			{
				System.out.println("Enter value of a[" + i + "][" + j + "] : ");
				a[i][j] = sc.nextInt();
			}
		}

		int rowSum[] = new int[3];
		for (int i = 0; i < ROW; i++)
		{
			for (int j = 0; j < COL; j++)
			{
				rowSum[i] += a[i][j];
			}
		}

		int colSum[] = new int[3];
		for (int i = 0; i < ROW; i++)
		{
			for (int j = 0; j < COL; j++)
			{
				colSum[i] += a[j][i];
			}
		}

		System.out.println("Matrix A is : \n");
		for (int i = 0; i < ROW; i++)
		{
			for (int j = 0; j < COL; j++)
			{
				System.out.print(a[i][j] + "\t");
			}
			System.out.println();
		}

		for (int i = 0; i < ROW; i++)
		{
			System.out.print("Row-" + (i + 1) + " => " + rowSum[i] + "\n");
		}

		for (int j = 0; j < COL; j++)
		{
			System.out.print("Col-" + (j + 1) + " => " + colSum[j] + "\n");
		}

	}
}