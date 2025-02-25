package Java_Collection._1_Collection_Framework.SortingTechnique.NonPrimitiveDataTypes.Comparable;

import java.util.ArrayList;
import java.util.Collections;

public class TestApp
{
	public static void main(String[] args)
	{
		Student s1 = new Student(1, "Rahul", 12, 100);
		Student s2 = new Student(2, "Sagar", 11, 90);
		Student s3 = new Student(7, "Kunal", 10, 80);
		Student s4 = new Student(6, "Suresh", 9, 70);
		Student s5 = new Student(5, "Viral", 8, 60);

		ArrayList<Student> listObj = new ArrayList<Student>();

		listObj.add(s1);
		listObj.add(s2);
		listObj.add(s3);
		listObj.add(s4);
		listObj.add(s5);

		System.out.println("Before Marks Sorting : ");
		System.out.println("---------------------------");
		for (Student s : listObj)
		{
			System.out.println(s.getRno() + " " + s.getName() + " " + s.getStd() + " " + s.getMarks());
		}

		Collections.sort(listObj);
		System.out.println("After Marks Sorting : ");
		System.out.println("---------------------------");
		for (Student s : listObj)
		{
			System.out.println(s.getRno() + " " + s.getName() + " " + s.getStd() + " " + s.getMarks());
		}
	}
}
