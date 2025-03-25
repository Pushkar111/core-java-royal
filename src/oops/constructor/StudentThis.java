package oops.constructor;

/*
Constructor Overloading 
Constructor Chaining  ----> this()
instance Variables    ----> (this.variable)
 */

public class StudentThis
{

	int rno;
	String name;
	int std;
	String schoolName;
	int marks;

	// No parameters. Used when no values are provided.
	public StudentThis()
	{

	}

	public StudentThis(int rno, String name, int std)
	{
		this(); // constructor overloading
		this.rno = rno;
		this.name = name;
		this.std = std; // instance Variables
	}

	public StudentThis(int rno, String name, int std, String schoolName)
	{
		this(rno, name, std);
		this.schoolName = schoolName;
	}

	public StudentThis(int rno, String name, int std, String schoolName, int marks)
	{
		this(rno, name, std, schoolName);
		this.marks = marks;
	}

	public void dispData()
	{
		System.out.println(this.rno + " " + this.name + " " + this.std + " " + this.schoolName + " " + this.marks);
	}

	public static void main(String[] args)
	{
		StudentThis s1 = new StudentThis();
		StudentThis s2 = new StudentThis(3, "Mayur", 10);
		StudentThis s3 = new StudentThis(2, "Keyur", 11, "ABC");
		StudentThis s4 = new StudentThis(1, "Rahul", 12, "DPS", 100);

		s1.dispData();
		s2.dispData();
		s3.dispData();
		s4.dispData();
	}

}
