package Modifiers.Static;

import java.util.Scanner;

public class Student
{
	// instance variable -- [Different for each Student]
	int rno;
	String name;
	int std;

	// static variable -- [schoolName is remain same for all Student]
	static String schoolName;

	// Static Method
	public static void setSchoolname(String schoolName)
	{
		Student.schoolName = schoolName;
	}

	public void scanData()
	{
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter Rno : ");
		rno = sc.nextInt();

		sc.nextLine();
		System.out.println("Enter Name : ");
		name = sc.nextLine();

		System.out.println("Enter Std : ");
		std = sc.nextInt();

	}

	public void dispData()
	{
		System.out.println(rno + " " + name + " " + std + " " + schoolName);
	}

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);

		Student.schoolName = "DPS";
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

		// static dm's can change by class Name or static Variable name but change for
		// all [because static variable has 1 copy for all objects]
		// if we change by using any object name it shows warning and compiler convert
		// it by classname
		Student.schoolName = "Meghdoot";

		for (int i = 0; i < s.length; i++)
		{
			s[i].dispData();
		}
	}

}
