package Java_Collection._1_Collection_Framework.setTopic.TreeSet;

import java.util.Iterator;
import java.util.TreeSet;

public class TestApp
{
	public static void main(String[] args)
	{
		// Generic
		TreeSet<String> setObj = new TreeSet<String>();

		setObj.add("Rahul");
		setObj.add("Sagar");
		setObj.add("Kirtan");
		setObj.add("Sagar");
		setObj.add("Mehul");
		setObj.add("Kunal");
		setObj.add("Mehul");

		Iterator<String> itr = setObj.iterator();

		while (itr.hasNext())
		{
			String str = (String) itr.next();
			System.out.println(str);
		}
	}
}
