package oops.Encapsulation;

import java.util.Scanner;

/*
	-> Encapsulation in Java is a process of wrapping code and data together into a single unit, 
	-> for example, a capsule which is mixed of several medicines. 

	-> Advantages: 
		- control over the data
		- data hiding 
		- easy to test
		- easy and fast to create an encapsulated class
*/
public class Student
{

	private int rno;
	private String name;
	private int std;

	public Student()
	{

	}

	public Student(int rno, String name, int std)
	{
		super();
		this.rno = rno;
		this.name = name;
		this.std = std;
	}

	public int getRno()
	{
		return rno;
	}

	public void setRno(int rno)
	{
		this.rno = rno;
	}

	public String getName()
	{
		return name;
	}

	public void setName(String name)
	{
		this.name = name;
	}

	public int getStd()
	{
		return std;
	}

	public void setStd(int std)
	{
		this.std = std;
	}

	void scanData()
	{
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter rno : ");
		rno = sc.nextInt();
		sc.nextLine();

		System.out.println("Enter name : ");
		name = sc.nextLine();

		System.out.println("Enter std : ");
		std = sc.nextInt();
	}

	void dispData()
	{
		System.out.println(rno + " " + name + " " + std);
	}

	public static void main(String[] args)
	{
		Student s[] = new Student[5];

		for (int i = 0; i < s.length; i++)
		{
			s[i] = new Student();
			s[i].scanData();
		}

		for (int i = 0; i < s.length; i++)
		{
			s[i].dispData();

		}

	}

}
