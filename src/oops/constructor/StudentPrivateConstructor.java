package oops.constructor;

class Student
{
	int rno;
	String name;
	int std;

	private static Student s = null;

	private Student()
	{

	}

	public static Student getInstance()
	{
		if (s == null)
		{
			s = new Student();
		}
		return s;
	}
}

public class StudentPrivateConstructor
{
	public static void main(String[] args)
	{
		Student obj1 = Student.getInstance();
		Student obj2 = Student.getInstance();
		Student obj3 = Student.getInstance();
		Student obj4 = Student.getInstance();
		Student obj5 = Student.getInstance();

		System.out.println("obj1 : " + obj1);
		System.out.println("obj2 : " + obj2);
		System.out.println("obj3 : " + obj3);
		System.out.println("obj4 : " + obj4);
		System.out.println("obj5 : " + obj5);
	}
}
