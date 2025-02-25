package Java_Collection._1_Collection_Framework.ListTopic.ArrayList;

import java.util.ArrayList;
import java.util.Iterator;

public class TestApp2
{
	public static void main(String[] args)
	{
		// Generic
		// Auto boxing: by wrapper class primitive type convert to object.
		ArrayList<String> listObj = new ArrayList<String>();

		listObj.add("Rahul");
		listObj.add("Sagar");
		listObj.add("Kirtan");
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
