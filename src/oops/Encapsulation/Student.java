package oops.Encapsulation;

/*
	-> Encapsulation in Java OOPS Feauture which wrapping code and data together into a single unit, 
	-> Dm's must be Private
	-> And it is Access and change by Getter and Setter methods
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

	void dispData()
	{
		System.out.println(rno + " " + name + " " + std);
	}

	public static void main(String[] args)
	{
		Student s1 = new Student(1, "Rahul", 12);

		s1.dispData();

		// modify using setter method
		s1.setName("Ram");

		s1.dispData();

	}

}
