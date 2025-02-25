package Exception_Handling.Java_multiple_catch_block_3;

import java.util.Scanner;

public class TestApp {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("stmt - 1");
		System.out.println("stmt - 2");
		System.out.println("stmt - 3");
		System.out.println("stmt - 4");
		System.out.println("stmt - 5");

		System.out.println("Enter no1: ");
		int no1 = sc.nextInt();
		System.out.println("Enter no2: ");
		int no2 = sc.nextInt();

		int ans = 0;

		try {
			ans = no1 + no2;

			String name = null;
			System.out.println(name.charAt(name.length()));

			int[] a = new int[5];
			a[10] = 100;

		} catch (ArithmeticException | StringIndexOutOfBoundsException e) {
			System.out.println("catch block handle -- exception -- " + e.getClass().getName());
		} catch (Exception e) {
			System.out.println("catch block handle -- exception -- " + e.getClass().getName());
		}

		System.out.println("Ans : " + ans);

		System.out.println("stmt - 6");
		System.out.println("stmt - 7");
		System.out.println("stmt - 8");
		System.out.println("stmt - 9");
		System.out.println("stmt - 10");

	}
}
