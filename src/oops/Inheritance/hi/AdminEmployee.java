package oops.Inheritance.hi;

import java.util.Scanner;

public class AdminEmployee extends Employee {

	String dsgn;

	public void scanData() {
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter id : ");
		id = sc.nextInt();

		sc.nextLine();
		System.out.print("Enter Name : ");
		name = sc.nextLine();

		System.out.print("Enter Salary : ");
		salary = sc.nextInt();

		sc.nextLine();
		System.out.print("Enter dsgn : ");
		dsgn = sc.nextLine();
	}

	public void dispData() {
		System.out.println(id + " " + name + " " + salary + " " + dsgn);
	}

}
