// ArithmeticException

package Exception_Handling.Java_Exceptions_1;

import java.util.Scanner;

public class JavaExceptionExample1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("stmt 1");
		System.out.println("stmt 2");
		System.out.println("stmt 3");
		System.out.println("stmt 4");
		System.out.println("stmt 5");

		System.out.println("Enter no1 : ");
		int no1 = sc.nextInt();
		System.out.println("Enter no2 : ");
		int no2 = sc.nextInt();

		int ans = no1 / no2; // 10 / 0

		System.out.println(ans);

		System.out.println("stmt 6");
		System.out.println("stmt 7");
		System.out.println("stmt 8");
		System.out.println("stmt 9");
		System.out.println("stmt 10");
	}
}
