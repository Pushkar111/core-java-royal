package Java_Collection._1_Collection_Framework;

import java.util.ArrayDeque;
import java.util.Deque;

public class TestJavaCollection9
{
	public static void main(String[] args)
	{
		Deque<String> deque = new ArrayDeque<String>();

		deque.add("Gautam");
		deque.add("Karan");
		deque.add("Ajay");

		// Traversing elements
		for (String str : deque)
		{
			System.out.println(str);
		}
	}
}
