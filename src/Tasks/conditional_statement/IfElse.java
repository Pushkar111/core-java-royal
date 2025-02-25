package Tasks.conditional_statement;

import java.util.Scanner;

public class IfElse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int no1;

		System.out.print("Enter No1 : ");
		no1 = sc.nextInt();

		if (no1 > 0) {
			System.out.println("Enter No is Positive");
		} else {
			System.out.println("Enter No is Negative");
		}

	}

}
