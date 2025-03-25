package Tasks.for_loop;

public class First10DigitSum
{
	public static void main(String[] args)
	{
		int sum = 0;
		for (int i = 1; i <= 10; i++)
		{
			sum += i;
		}
		System.out.println("Sum of First 10 Digit : " + sum);
	}
}
