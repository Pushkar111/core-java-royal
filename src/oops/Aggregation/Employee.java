package oops.Aggregation;

public class Employee
{
	int id;
	String name;
	int salary;
	String dsgn;
	Address address; // ---> Aggregation --> // Aggregation: Employee "HAS-A" Address

	public Employee(int id, String name, int salary, String dsgn, Address address)
	{
		this.id = id;
		this.name = name;
		this.salary = salary;
		this.dsgn = dsgn;
		this.address = address;
	}

	public void dispData()
	{
		System.out.println(id + " " + name + " " + salary + " " + dsgn + " " + address.getCity() + ", " + address.getState() + ", " + address.getCountry());
	}

	public static void main(String[] args)
	{
		Address a1 = new Address("Odhav", "Ahmedabad", "India");
		Employee e1 = new Employee(1, "Ram", 1000, "IT", a1);

		Address a2 = new Address("Vastral", "Ahmedabad", "India");
		Employee e2 = new Employee(2, "Kunal", 3131, "Programmer", a2);

		Address a3 = new Address("Nikol", "Ahmedabad", "India");
		Employee e3 = new Employee(3, "Jack", 2000, "Clerk", a3);

		e1.dispData();
		e2.dispData();
		e3.dispData();
	}
}
