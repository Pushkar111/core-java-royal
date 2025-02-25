package Java_Collection._1_Collection_Framework.ListTopic.LinkedList.StudentApplication;

import java.util.Comparator;

public class NameWiseComparator implements Comparator<Student>
{
	@Override
	public int compare(Student s1, Student s2)
	{
		return s1.getName().compareTo(s2.getName());
	}
}
