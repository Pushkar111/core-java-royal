package Java_Collection._1_Collection_Framework;

import java.util.Iterator;
import java.util.LinkedList;

public class TestJavaCollection4
{
	public static void main(String[] args)
	{
		LinkedList<String> listObj = new LinkedList<String>();

		listObj.add("Rahul");
		listObj.add("Sagar");
		listObj.add("Keyur");
		listObj.add("Rahul");
		listObj.add("Hetul");

		Iterator<String> itr = listObj.iterator();
		while (itr.hasNext())
		{
			String obj = (String) itr.next();
			System.out.println(obj);
		}
	}
}
