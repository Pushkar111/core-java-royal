package Java_Collection._1_Collection_Framework.ListTopic.ArrayList.EmployeeApplication;

import java.util.Comparator;

public class EidWiseComparator implements Comparator<Employee>
{
	public int compare(Employee e1, Employee e2)
	{
		if (e1.getEid() > e2.getEid())
		{
			return 1;
		} else if (e1.getEid() < e2.getEid())
		{
			return -1;
		} else
		{
			return 0;
		}
	}
}
