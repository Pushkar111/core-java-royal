package Java_Collection._1_Collection_Framework.ListTopic.ArrayList.EmployeeApplication;

import java.util.Comparator;

public class DsgnWiseComparator implements Comparator<Employee>
{
	@Override
	public int compare(Employee e1, Employee e2)
	{
		return e1.getDsgn().compareTo(e2.getDsgn());
	}
}
