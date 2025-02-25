package Java_Collection._1_Collection_Framework.ListTopic.Vector.EmployeeApplication;

import java.util.Scanner;

// Pure Encapsulation

public class Employee
{
	private int eid;
	private String name;
	private int salary;
	private String dsgn;

	public Employee()
	{

	}

	public Employee(int eid, String name, int salary, String dsgn)
	{
		this.eid = eid;
		this.name = name;
		this.salary = salary;
		this.dsgn = dsgn;
	}

	public int getEid()
	{
		return eid;
	}

	public void setEid(int eid)
	{
		this.eid = eid;
	}

	public String getName()
	{
		return name;
	}

	public void setName(String name)
	{
		this.name = name;
	}

	public int getSalary()
	{
		return salary;
	}

	public void setSalary(int salary)
	{
		this.salary = salary;
	}

	public String getDsgn()
	{
		return dsgn;
	}

	public void setDsgn(String dsgn)
	{
		this.dsgn = dsgn;
	}

	public void scanData()
	{
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter Eid : ");
		eid = sc.nextInt();
		sc.nextLine();
		System.out.println("Enter Name : ");
		name = sc.nextLine();
		System.out.println("Enter Salary : ");
		salary = sc.nextInt();
		sc.nextLine();
		System.out.println("Enter Dsgn : ");
		dsgn = sc.nextLine();

	}

	public void updateData()
	{
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter Name : ");
		name = sc.nextLine();
		System.out.println("Enter Salary : ");
		salary = sc.nextInt();
		sc.nextLine();
		System.out.println("Enter Dsgn : ");
		dsgn = sc.nextLine();

	}

	public void dispData()
	{
		System.out.println(eid + " " + name + " " + salary + " " + dsgn);
	}

}
