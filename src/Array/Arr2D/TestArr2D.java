package Array.Arr2D;

import java.util.Scanner;

public class TestArr2D {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int ROW = 3, COl = 3;
		int a[][] = new int[ROW][COl];

		Scanner sc = new Scanner(System.in);

		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				System.out.print("Enter the value of a[" + i + "][" + j + "] : ");
				a[i][j] = sc.nextInt();
			}
		}

		System.out.println("Matrix A");
		System.out.println("--------------------------------");
		for (int i = 0; i < a[i].length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				System.out.print(a[i][j] + "\t");
			}
			System.out.println();
		}

	}

}
