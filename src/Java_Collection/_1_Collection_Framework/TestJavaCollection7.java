package Java_Collection._1_Collection_Framework;

import java.util.Iterator;
import java.util.TreeSet;

public class TestJavaCollection7
{
	public static void main(String[] args)
	{
		TreeSet<String> setObj = new TreeSet<String>();

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
