package oops.Inheritance.mli;

import java.util.Scanner;

public class TechEmployee extends Employee {

	int salary;

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

	public static void main(String[] args) {

		TechEmployee t = new TechEmployee();

		t.scanData();
		t.dispData();
	}

}
