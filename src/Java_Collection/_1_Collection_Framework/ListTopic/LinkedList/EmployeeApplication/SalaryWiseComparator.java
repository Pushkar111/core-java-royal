package Java_Collection._1_Collection_Framework.ListTopic.LinkedList.EmployeeApplication;

import java.util.Comparator;

public class SalaryWiseComparator implements Comparator<Employee>
{
	@Override
	public int compare(Employee e1, Employee e2)
	{
		if (e1.getSalary() > e2.getSalary())
		{
			return 1;
		} else if (e1.getSalary() < e2.getSalary())
		{
			return -1;
		} else
		{
			return 0;
		}
	}
}
