package Java_Collection._1_Collection_Framework;

import java.util.Iterator;
import java.util.Stack;

public class TestJavaCollection3
{
	public static void main(String[] args)
	{
		Stack<String> stackObj = new Stack<String>();

		stackObj.push("Rahul");
		stackObj.push("Sagar");
		stackObj.push("Keyur");
		stackObj.push("Rahul");
		stackObj.push("Hetul");

		Iterator<String> itr = stackObj.iterator();
		while (itr.hasNext())
		{
			String obj = (String) itr.next();
			System.out.println(obj);
		}
	}
}
