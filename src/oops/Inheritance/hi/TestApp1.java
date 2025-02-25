package oops.Inheritance.hi;

import java.util.Scanner;

public class TestApp1 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("1. AdminEmployee");
		System.out.println("2. TechEmployee");

		System.out.print("Enter the choice : ");
		int choice = sc.nextInt();

		switch (choice) {

		case 1:
			AdminEmployee a = new AdminEmployee();
			a.scanData();
			a.dispData();
			break;

		case 2:
			TechEmployee t = new TechEmployee();
			t.scanData();
			t.dispData();
			break;

		default:
			System.out.println("Invalid Choice");
		}

	}

}
