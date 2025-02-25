package Tasks.conditional_statement;

import java.util.Scanner;

public class NestedIfElse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int no1, no2, no3;

		System.out.print("Enter No1 : ");
		no1 = sc.nextInt();

		System.out.print("Enter No2 : ");
		no2 = sc.nextInt();

		System.out.print("Enter No3 : ");
		no3 = sc.nextInt();

		if (no1 > no2) {
			if (no1 > no3) {
				System.out.println(no1 + " is Greatest");
			} else {
				System.out.println(no3 + " is Greatest");
			}
		} else {
			if (no2 > no3) {
				System.out.println(no2 + " is Greatest");
			} else {
				System.out.println(no3 + " is Greatest");
			}
		}

	}

}
