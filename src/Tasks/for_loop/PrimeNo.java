package Tasks.for_loop;

import java.util.Scanner;

public class PrimeNo
{
	public static void main(String[] args)
	{
		int no, count = 0;
		boolean flag = true;

		Scanner sc = new Scanner(System.in);

		System.out.print("Enter No : ");
		no = sc.nextInt();

		for (int i = 2; i < no; i++)
		{
			if (no % i == 0)
			{
				flag = false;
				break;
			}
		}

		if (flag)
		{
			System.out.println(no + " is Prime");
		} else
		{
			System.out.println(no + " is not Prime");
		}

		System.out.println("------------------------------------------------------------------------------");
		System.out.println("First 100 Prime Numbers");
		System.out.println("------------------------------------------------------------------------------");

		for (int i = 2; i <= 100; i++)
		{
			flag = true;
			for (int j = 2; j * j <= i; j++)
			{
				if (i % j == 0)
				{
					flag = false;
					break;
				}
			}
			if (flag)
			{
				System.out.print(i + " ");
				count++;
			}
		}

		System.out.println("\nCount : " + count);
	}

}
