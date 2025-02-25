package Java_Collection._2_Java_ArrayList_Class;

import java.util.ArrayList;

class Student
{
	private int rno;
	private String name;
	private int std;

	public Student()
	{

	}

	public Student(int rno, String name, int std)
	{
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

}

public class ArrayListExample4_User_defined_Class_Student
{
	public static void main(String[] args)
	{
		ArrayList<Student> listObj = new ArrayList<Student>();

		Student s1 = new Student(1, "Rahul", 12);
		Student s2 = new Student(2, "Sagar", 13);
		Student s3 = new Student(3, "Kunal", 14);

		listObj.add(s1);
		listObj.add(s2);
		listObj.add(s3);

		for (Student obj : listObj)
		{
			if (obj instanceof Student)
			{
				Student s = (Student) obj;
				System.out.println(s.getRno() + " " + s.getName() + " " + s.getStd());
			} else
			{
				System.out.println(obj);
			}
		}
	}
}
