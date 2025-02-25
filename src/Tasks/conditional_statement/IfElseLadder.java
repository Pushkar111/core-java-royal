package Tasks.conditional_statement;

import java.util.Scanner;

public class IfElseLadder {

	public static void main(String args[]) {

		Scanner sc = new Scanner(System.in);
		int no1;

		System.out.print("Enter No1 : ");
		no1 = sc.nextInt();

		if (no1 > 0) {
			System.out.println("Enter No is Positive");
		} else if (no1 == 0) {
			System.out.println("Enter No is Zero");
		} else {
			System.out.println("Enter No is Negative");
		}

	}
}
