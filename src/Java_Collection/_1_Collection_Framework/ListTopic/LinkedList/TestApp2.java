package Java_Collection._1_Collection_Framework.ListTopic.LinkedList;

import java.util.Iterator;
import java.util.LinkedList;

public class TestApp2
{
	public static void main(String[] args)
	{
		// Generic
		LinkedList<String> listObj = new LinkedList<String>();

		listObj.add("Rahul");
		listObj.add("Sagar");
		listObj.add("Kirtan");
		listObj.add("Kunal");
		listObj.add("Mehul");
		listObj.add("Kunal");

		Iterator<String> itr = listObj.iterator();

		while (itr.hasNext())
		{
			String str = (String) itr.next();
			System.out.println(str);
		}
	}
}
