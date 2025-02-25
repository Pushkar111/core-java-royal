package Java_Collection._1_Collection_Framework;

import java.util.ArrayList;
import java.util.Iterator;

public class TestJavaCollection1
{
	public static void main(String[] args)
	{
		ArrayList<String> listObj = new ArrayList<String>();

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
