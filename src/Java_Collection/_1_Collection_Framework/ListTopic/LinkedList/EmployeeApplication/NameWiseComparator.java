package Java_Collection._1_Collection_Framework.ListTopic.LinkedList.EmployeeApplication;

import java.util.Comparator;

public class NameWiseComparator implements Comparator<Employee>
{
	@Override
	public int compare(Employee e1, Employee e2)
	{
		return e1.getName().compareTo(e2.getName());
	}
}
