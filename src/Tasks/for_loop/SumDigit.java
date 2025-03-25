package Tasks.for_loop;

import java.util.Scanner;

public class SumDigit
{

	public static void main(String[] args)
	{
		int no, sum = 0, temp;

		Scanner sc = new Scanner(System.in);

		System.out.print("Enter No : ");
		no = sc.nextInt();

		for (; no > 0;)
		{
			temp = no % 10;
			sum += temp;
			no /= 10;
		}

		System.out.println("Digit Sum = " + sum);

	}

}
