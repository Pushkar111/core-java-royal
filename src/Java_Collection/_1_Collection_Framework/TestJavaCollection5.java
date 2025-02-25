package Java_Collection._1_Collection_Framework;

import java.util.HashSet;
import java.util.Iterator;

public class TestJavaCollection5
{
	public static void main(String[] args)
	{
		HashSet<String> setObj = new HashSet<String>();

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
