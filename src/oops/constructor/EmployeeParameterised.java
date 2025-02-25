package oops.constructor;

public class EmployeeParameterised
{

	int id;
	String name;
	int salary;
	String dsgn;

	// Parameterised Consntructor
	EmployeeParameterised(int id, String name, int salary, String dsgn)
	{
		System.out.println("START :: Parameterised CONSTRUCTOR");
		System.out.println("Before :: " + this.id + " " + this.name + " " + this.salary + " " + this.dsgn);

		this.id = id;
		this.name = name;
		this.salary = salary;
		this.dsgn = dsgn;

		System.out.println("After :: " + id + " " + name + " " + salary + " " + dsgn);
		System.out.println("END :: Parameterised CONSTRUCTOR");
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
		EmployeeParameterised e1 = new EmployeeParameterised(1, "Rahul", 12, "SE");
		e1.dispData();
	}
}
