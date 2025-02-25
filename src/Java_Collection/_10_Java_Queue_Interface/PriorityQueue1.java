package Java_Collection._10_Java_Queue_Interface;

import java.util.PriorityQueue;

public class PriorityQueue1
{
	public static void main(String[] args)
	{
		// FIFO
		PriorityQueue<String> pq = new PriorityQueue<String>();

		pq.add("Rahul");
		pq.add("Sagar");
		pq.add("Danish");
		pq.add("Fenil");
		pq.add("Viral");
		pq.add("Rahul");

		System.out.println("PriorityQueue : " + pq);

		System.out.println("Head : " + pq.element());
		System.out.println("Head : " + pq.peek());

		System.out.println("\nIterating elements : ");
		System.out.println("-----------------------------------------");
		pq.forEach(str -> {
			System.out.println(str);
		});

		pq.remove();
		pq.poll();

		System.out.println("\nAfter Removing Two elements : ");
		System.out.println("-----------------------------------------");
		pq.forEach(str -> {
			System.out.println(str);
		});

	}
}
