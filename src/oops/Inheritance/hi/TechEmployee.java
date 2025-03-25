package oops.Inheritance.hi;

import java.util.Scanner;

public class TechEmployee extends Employee
{

	int bonus;

	public void scanData()
	{
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter id : ");
		id = sc.nextInt();

		sc.nextLine();
		System.out.print("Enter Name : ");
		name = sc.nextLine();

		System.out.print("Enter Salary : ");
		salary = sc.nextInt();

		System.out.print("Enter Bonus : ");
		bonus = sc.nextInt();
	}

	public void dispData()
	{
		System.out.println(id + " " + name + " " + salary + " " + bonus);
	}
}
