package Java_Collection._1_Collection_Framework;

import java.util.Iterator;
import java.util.PriorityQueue;

public class TestJavaCollection8
{
	public static void main(String args[])
	{
		PriorityQueue<String> queueObj = new PriorityQueue<String>();

		queueObj.add("Amit Sharma");
		queueObj.add("Vijay Raj");
		queueObj.add("JaiShankar");
		queueObj.add("Raj");

		System.out.println("head:" + queueObj.element());
		System.out.println("head:" + queueObj.peek());

		System.out.println("iterating the queue elements:");
		Iterator<String> itr = queueObj.iterator();
		while (itr.hasNext())
		{
			String obj = (String) itr.next();
			System.out.println(obj);
		}
		queueObj.remove();
		queueObj.poll();

		System.out.println("after removing two elements:");
		Iterator<String> itr2 = queueObj.iterator();
		while (itr2.hasNext())
		{
			String obj = (String) itr2.next();
			System.out.println(obj);
		}
	}
}
