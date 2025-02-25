package Modifiers.Static;

import java.util.Scanner;

public class Employee {

	int id;
	String name;
	int salary;
	String dsgn;
	static String orgName;

	public static void orgName(String orgName) {
		Employee.orgName = orgName;
	}

	public void scanData() {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter id : ");
		id = sc.nextInt();

		sc.nextLine();
		System.out.println("Enter Name : ");
		name = sc.nextLine();

		System.out.println("Enter salary : ");
		salary = sc.nextInt();

		sc.nextLine();
		System.out.println("Enter dsgn : ");
		dsgn = sc.nextLine();

	}

	public void dispData() {
		System.out.println(id + " " + name + " " + salary + " " + dsgn + " " + orgName);
	}

	public static void main(String[] args) {
		Employee.orgName = "Google";
		Employee e[] = new Employee[5];
		Scanner sc = new Scanner(System.in);

		for (int i = 0; i < e.length; i++) {
			e[i] = new Employee();
			e[i].scanData();
		}

		for (int i = 0; i < e.length; i++) {
			e[i].dispData();
		}

		// static dm's can change by object name but change for all
		e[2].orgName = "TCS";

		for (int i = 0; i < e.length; i++) {
			e[i].dispData();
		}

	}

}
