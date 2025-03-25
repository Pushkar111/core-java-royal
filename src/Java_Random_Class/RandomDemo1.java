package Java_Random_Class;

import java.util.Random;

/*
Important Methods

Method					Description
--------------------------------------------------------------------------
nextInt(int bound)		Returns a random integer between 0 and bound-1.
nextDouble()			Returns a random double between 0.0 and 1.0.
nextBoolean()			Returns true or false randomly.
nextLong()				Returns a random long value.
setSeed(long seed)		Sets a seed for reproducible results.

*/

public class RandomDemo1
{
	public static void main(String[] args)
	{
		// Two Ways to Generate Random Numbers

		// 1st Way ---> Random Class
		Random random = new Random();

		System.out.println("Random Integer: " + random.nextInt(50)); // 0 to 49 Random Values
		System.out.println("Random Double: " + random.nextDouble()); // 0.0 to 1.0
		System.out.println("Random Boolean: " + random.nextBoolean());

		Random random2 = new Random(3);
		for (int i = 0; i < 10; i++)
		{
			System.out.print(random2.nextInt(1000) + " ");
		}
		System.out.println();
		Random random3 = new Random(3);
		for (int i = 0; i < 10; i++)
		{
			System.out.print(random3.nextInt(1000) + " ");
		}

		// 2nd Way ---> Math.random()
		double randomDouble = Math.random(); // Returns a double from 0.0 to 1.0
		System.out.println("\nRandom Double: " + randomDouble);
		int randomInt = (int) (Math.random() * 100); // 0 to 99
		System.out.println("Random Integer: " + randomInt);

	}
}
