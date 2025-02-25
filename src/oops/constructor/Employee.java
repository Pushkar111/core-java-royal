package oops.constructor;

public class Employee
{

	int id;
	String name;
	int salary;
	String dsgn;

	// Default Consntructor
	Employee()
	{
		System.out.println("START :: DEFAULT CONSTRUCTOR");
		System.out.println("Before :: " + id + " " + name + " " + salary + " " + dsgn);

		// Initializing instance variables
		id = 1;
		name = "Rahul";
		salary = 12;
		dsgn = "SE";

		System.out.println("After :: " + id + " " + name + " " + salary + " " + dsgn);
		System.out.println("END :: DEFAULT CONSTRUCTOR");
	}

	public void dispData()
	{
		System.out.println("\ndispData()--------------" + this);
		System.out.println("id : " + id);
		System.out.println("name: " + name);
		System.out.println("salary: " + salary);
		System.out.println("dsgn: " + dsgn);
	}

	public static void main(String[] args)
	{
		Employee e1 = new Employee();

		e1.dispData();
	}

}
