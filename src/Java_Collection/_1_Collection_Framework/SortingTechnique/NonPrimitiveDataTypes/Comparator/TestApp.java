package Java_Collection._1_Collection_Framework.SortingTechnique.NonPrimitiveDataTypes.Comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class TestApp
{
	public static void main(String[] args)
	{
		ArrayList<Student> listObj = new ArrayList<Student>();
		Scanner sc = new Scanner(System.in);

		Student s1 = new Student(1, "Rahul", 12, 100);
		Student s2 = new Student(2, "Sagar", 11, 90);
		Student s3 = new Student(7, "Kunal", 10, 80);
		Student s4 = new Student(6, "Suresh", 9, 70);
		Student s5 = new Student(5, "Viral", 8, 60);

		listObj.add(s1);
		listObj.add(s2);
		listObj.add(s3);
		listObj.add(s4);
		listObj.add(s5);

		while (true)
		{
			System.out.println("==============================================");
			System.out.println("1. Rno Sorting");
			System.out.println("2. Name Sorting");
			System.out.println("3. Std Sorting");
			System.out.println("4. Marks Sorting");
			System.out.println("5. Display");
			System.out.println("6. Exit");
			System.out.println("==============================================");

			System.out.println("Enter Choice : ");
			int choice = sc.nextInt();

			switch (choice)
			{
			case 1:
				Collections.sort(listObj, new RnoWiseComparator());
				System.out.println("After Rno Sorting : ");
				dispData(listObj);
				break;

			case 2:
				Collections.sort(listObj, new NameWiseComparator());
				System.out.println("After Name Sorting : ");
				dispData(listObj);
				break;

			case 3:
				Collections.sort(listObj, new StdWiseComparator());
				System.out.println("After Std Sorting : ");
				dispData(listObj);
				break;

			case 4:
				Collections.sort(listObj, new MarksWiseComparator());
				System.out.println("After Marks Sorting : ");
				dispData(listObj);
				break;

			case 5:
				dispData(listObj);
				break;

			case 6:
				exitApplication();
				break;

			default:
				System.out.println("Invalid choice. Please choose a valid option.");

			}
		}
	}

	private static void dispData(ArrayList<Student> listObj)
	{
		System.out.println("---------------------------");
		System.out.println("Rno\tName\tStd\tMarks");
		System.out.println("---------------------------");
		for (Student s : listObj)
		{
			System.out.println(s.getRno() + "\t" + s.getName() + "\t" + s.getStd() + "\t" + s.getMarks());
		}
		System.out.println("---------------------------");
	}

	private static void exitApplication()
	{
		try
		{
			Thread.sleep(500);
		} catch (InterruptedException e)
		{
			e.printStackTrace();
		}
		System.out.println("======================== Application Closed Successfully ========================");
		System.exit(0);
	}

}
