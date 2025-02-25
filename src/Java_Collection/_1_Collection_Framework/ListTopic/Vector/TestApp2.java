package Java_Collection._1_Collection_Framework.ListTopic.Vector;

import java.util.Iterator;
import java.util.Vector;

public class TestApp2
{
	public static void main(String[] args)
	{
		// Generic
		Vector<String> v = new Vector<String>();

		v.add("Rahul");
		v.add("Sagar");
		v.add("Kirtan");
		v.add("Mehul");
		v.add("Kunal");

		Iterator<String> itr = v.iterator();

		while (itr.hasNext())
		{
			String str = (String) itr.next();
			System.out.println(str);
		}
	}
}
