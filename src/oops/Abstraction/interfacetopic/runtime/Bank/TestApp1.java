package oops.Abstraction.interfacetopic.runtime.Bank;

import java.util.Scanner;

public class TestApp1
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);

		System.out.println("1. Axis Bank");
		System.out.println("2. Bob Bank");
		System.out.println("3. Sbi Bank");

		System.out.println("Enter choice : ");
		int choice = sc.nextInt();

		RbiBank b = null;

		switch (choice)
		{
		case 1:
			b = new Axis();
			b.getRoi();

			Axis axis = (Axis) b;
			axis.AxisInfo();
			break;

		case 2:
			b = new Bob();
			b.getRoi();

			Bob bob = (Bob) b;
			bob.BobInfo();
			break;

		case 3:
			b = new Sbi();
			b.getRoi();

			Sbi sbi = (Sbi) b;
			sbi.SbiInfo();
			break;

		}

	}
}
