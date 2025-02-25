package Java_Collection._1_Collection_Framework.ListTopic.Vector;

import java.util.Iterator;
import java.util.Vector;

class Student
{
	int rno;
	String name;
	int std;

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

	@Override
	public String toString()
	{
		return "==>" + getRno() + " " + getName() + " " + getStd();
	}

}

public class TestApp
{
	public static void main(String[] args)
	{
		Student s = new Student(1, "Rahul", 12);

		Vector v = new Vector();

		// Wrapper Classes Converts [primitive --> object]
		v.add("Royal"); // string to String
		v.add('r'); // char to Character
		v.add(12); // int to Int
		v.add(1232L); // long to Long
		v.add(21355.15);// double to Double
		v.add(123.45f); // float to Float
		v.add(true); // boolean to Boolean
		v.add(s); // student to Student

		System.out.println("v.size() : " + v.size());
		System.out.println("v.get(3) : " + v.get(3));

// ---------------------------------------------------------------------------------------------------------------------------

		System.out.println("1) First way to interate vector (Traditional Way)");
		Iterator itr = v.iterator();
		while (itr.hasNext())
		{
			Object obj = itr.next();

			if (obj instanceof Student)
			{
				Student s1 = (Student) obj;
				System.out.println(s1.getRno() + " " + s1.getName() + " " + s1.getStd());
			} else
			{
				System.out.println(obj);
			}
		}

// ---------------------------------------------------------------------------------------------------------------------------

		System.out.println("2) Second Way Simple For Loop [to() override in object[Student/Person/Product/Employee]]");
		for (int i = 0; i < v.size(); i++)
		{
			Object obj = v.get(i);
			System.out.println(obj);
		}

// ---------------------------------------------------------------------------------------------------------------------------

		System.out.println("3) Third Way Simple For Loop [with instance and without toSubstring() method overriding]");
		for (int i = 0; i < v.size(); i++)
		{
			Object obj = v.get(i);
			if (obj instanceof Student)
			{
				Student s2 = (Student) obj;
				System.out.println(s2.getRno() + " " + s2.getName() + " " + s2.getStd());
			} else
			{
				System.out.println(obj);
			}
		}

// ---------------------------------------------------------------------------------------------------------------------------

		System.out.println(
				"4) Fourth Way forEach Loop [toSubstring() override in object[Student/Person/Product/Employee]]");
		for (Object obj : v)
		{
			System.out.println(obj);
		}

// ---------------------------------------------------------------------------------------------------------------------------

		System.out.println("5) Fifth Way forEach Loop [with instance and without toSubstring() method overriding]");
		for (Object obj : v)
		{
			if (obj instanceof Student)
			{
				Student s3 = (Student) obj;
				System.out.println(s3.getRno() + " " + s3.getName() + " " + s3.getStd());
			} else
			{
				System.out.println(obj);
			}
		}

// ---------------------------------------------------------------------------------------------------------------------------

	}
}
