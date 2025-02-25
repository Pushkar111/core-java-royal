package Java_Collection._1_Collection_Framework.QueueTopic.PriorityQueue;

import java.util.PriorityQueue;

public class TestApp
{
	public static void main(String[] args)
	{
		PriorityQueue<String> queue = new PriorityQueue<String>();

		queue.add("Sagar");
		queue.add("Rahul");
		queue.add("Sagar");
		queue.add("Ram");
		queue.add("Rahul");
		queue.add("Fenil");
		queue.add("Kunal");

		while (!queue.isEmpty())
		{
			String name = queue.poll();
			System.out.println(name);
		}
	}
}
