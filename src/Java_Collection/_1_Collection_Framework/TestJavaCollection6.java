package Java_Collection._1_Collection_Framework;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class TestJavaCollection6
{
	public static void main(String[] args)
	{
		LinkedHashSet<String> setObj = new LinkedHashSet<String>();

		setObj.add("Rahul");
		setObj.add("Sagar");
		setObj.add("Keyur");
		setObj.add("Rahul");
		setObj.add("Hetul");

		Iterator<String> itr = setObj.iterator();
		while (itr.hasNext())
		{
			String obj = (String) itr.next();
			System.out.println(obj);
		}
	}
}
