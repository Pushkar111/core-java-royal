package Array.Arr2D;

import java.util.Scanner;

public class Calc2D
{
	static int ROW = 3, COL = 3;

	// scan
	public static void scanData(int a[][], int b[][])
	{
		Scanner sc = new Scanner(System.in);

		for (int i = 0; i < ROW; i++)
		{
			for (int j = 0; j < COL; j++)
			{
				System.out.println("Enter the value of a[" + i + "][" + j + "]: ");
				a[i][j] = sc.nextInt();
			}
		}

		for (int i = 0; i < ROW; i++)
		{
			for (int j = 0; j < COL; j++)
			{
				System.out.println("Enter the value of b[" + i + "][" + j + "]: ");
				b[i][j] = sc.nextInt();
			}
		}
	}

	// disp
	public static void dispData(int arr[][])
	{
		for (int i = 0; i < ROW; i++)
		{
			for (int j = 0; j < COL; j++)
			{
				System.out.print(arr[i][j] + "\t");
			}
			System.out.println();
		}

	}

	// Addition
	public static int[][] add(int a[][], int b[][])
	{
		int c[][] = new int[ROW][COL];

		for (int i = 0; i < ROW; i++)
		{
			for (int j = 0; j < COL; j++)
			{
				c[i][j] = a[i][j] + b[i][j];
			}
		}

		return c;
	}

	// subtraction
	public static int[][] sub(int a[][], int b[][])
	{
		int c[][] = new int[ROW][COL];

		for (int i = 0; i < ROW; i++)
		{
			for (int j = 0; j < COL; j++)
			{
				c[i][j] = a[i][j] - b[i][j];
			}
		}

		return c;
	}

	// Multiplication
	public static int[][] mult(int a[][], int b[][])
	{
		int c[][] = new int[ROW][COL];

		for (int i = 0; i < ROW; i++)
		{
			for (int j = 0; j < COL; j++)
			{
				for (int k = 0; k < COL; k++)
				{
					c[i][j] = c[i][j] + (a[i][k] * b[k][j]);
				}
			}
		}

		return c;
	}

	// Division
	public static int[][] div(int a[][], int b[][])
	{
		int c[][] = new int[ROW][COL];

		for (int i = 0; i < ROW; i++)
		{
			for (int j = 0; j < COL; j++)
			{
				c[i][j] = a[i][j] / b[i][j];
			}
		}

		return c;
	}

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int choice;

		int a[][] = new int[ROW][COL];
		int b[][] = new int[ROW][COL];
		int c[][] = new int[ROW][COL];

		scanData(a, b);

		System.out.println("Matrix - A......");
		dispData(a);

		System.out.println("Matrix - B......");
		dispData(b);

		while (true)
		{

			System.out.println("1. Addition");
			System.out.println("2. Subtraction");
			System.out.println("3. Multiplication");
			System.out.println("4. Division");
			System.out.println("5. Exit");

			System.out.println("Enter the Choice : ");
			choice = sc.nextInt();

			switch (choice)
			{
			case 1:
				System.out.println("Matrix - C......");
				c = add(a, b);
				dispData(c);
				break;
			case 2:
				System.out.println("Matrix - C......");
				c = sub(a, b);
				dispData(c);
				break;
			case 3:
				System.out.println("Matrix - C......");
				c = mult(a, b);
				dispData(c);
				break;
			case 4:
				System.out.println("Matrix - C......");
				c = div(a, b);
				dispData(c);
				break;

			case 5:
				System.exit(0);

			}
		}

	}
}
