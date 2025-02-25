package oops.constructor;

public class EmployeeCopy
{
	int id;
	String name;
	int salary;
	String dsgn;

	EmployeeCopy()
	{
		id = 1;
		name = "Rahul";
		salary = 12;
		dsgn = "SE";
	}

	// Copy Constructor
	EmployeeCopy(EmployeeCopy e)
	{
		System.out.println("START :: COPY CONSTRUCTOR");
		System.out.println("Before :: " + this.id + " " + this.name + " " + this.salary + " " + this.dsgn);

		this.id = e.id;
		this.name = e.name;
		this.salary = e.salary;
		this.dsgn = e.dsgn;

		System.out.println("EXIT :: COPY CONSTRUCTOR");
	}

	public void dispData()
	{
		System.out.println(this.id + " " + this.name + " " + this.salary + " " + this.dsgn);
	}

	public static void main(String args[])
	{
		EmployeeCopy e1 = new EmployeeCopy();
		e1.dispData();

		EmployeeCopy e2 = new EmployeeCopy(e1);
		e2.dispData();
	}
}
