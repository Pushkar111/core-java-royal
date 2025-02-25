package Doubts.Abstraction;

import java.util.Scanner;

public class TestApp
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);

		System.out.println("1. TwVehicle");
		System.out.println("2. LmvVehicle");
		System.out.println("3. HmvVehicle");

		System.out.println("Enter choice : ");
		int choice = sc.nextInt();

		Vehicle vehicle = null;

		switch (choice)
		{
		case 1:
			vehicle = new TwVehicle();
			vehicle.getSpec();
			break;

		case 2:
			vehicle = new LmvVehicle();
			vehicle.getSpec();
			break;

		case 3:
			vehicle = new HmvVehicle();
			vehicle.getSpec();
			break;

		}
	}
}
