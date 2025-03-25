package Modifiers.Static;

import java.util.Scanner;

public class Employee
{

	// instance variable -- [Different for each Employee]
	int id;
	String name;
	int salary;
	String dsgn;

	// static variable -- [orgName is remain same for all Employee]
	static String orgName;

	// Static Method - [not used not static dm's and not invoked non-static mf's directly]
	public static void setOrgName(String orgName)
	{
		Employee.orgName = orgName;
	}

	public void scanData()
	{
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

	public void dispData()
	{
		System.out.println(id + " " + name + " " + salary + " " + dsgn + " " + orgName);
	}

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);

		Employee.orgName = "Google";
		Employee e[] = new Employee[5];

		for (int i = 0; i < e.length; i++)
		{
			e[i] = new Employee();
			e[i].scanData();
		}

		for (int i = 0; i < e.length; i++)
		{
			e[i].dispData();
		}

		// static dm's can change by class Name or static Variable name but change for all [because static variable has 1 copy for all objects]
		// if we change by using any object name it shows warning and compiler convert it by classname
		Employee.setOrgName("TCS");

		for (int i = 0; i < e.length; i++)
		{
			e[i].dispData();
		}

	}

}
