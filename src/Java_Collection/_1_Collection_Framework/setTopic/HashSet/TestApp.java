package Java_Collection._1_Collection_Framework.setTopic.HashSet;

import java.util.HashSet;
import java.util.Iterator;

public class TestApp
{
	public static void main(String[] args)
	{
		// Generic
		HashSet<String> setObj = new HashSet<String>();

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
