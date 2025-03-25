package oops.Polymorphism.runtime.practice;

import java.util.Scanner;

public class TestApp
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);

		Vehicle vehicle = null;
		int choice;

		System.out.println("1. TwVehicle");
		System.out.println("2. LmvVehicle");
		System.out.println("3. HmvVehicle");

		System.out.println("Enter the choice : ");
		choice = sc.nextInt();

		switch (choice)
		{
		case 1: // UpCasting --> ParentReference = new ChildReference(); ---> ChildReference can
				// converts into ParentReference.
			vehicle = new TwVehicle();
			vehicle.getSpec();

			// DownCasting ---> ParentReference Converts into ChildReference
			TwVehicle tw = (TwVehicle) vehicle;
			tw.getTwInfo();
			break;

		case 2:
			vehicle = new LmvVehicle();
			vehicle.getSpec();

			LmvVehicle lmv = (LmvVehicle) vehicle;
			lmv.getLmvInfo();
			break;

		case 3:
			vehicle = new HmvVehicle();
			vehicle.getSpec();

			HmvVehicle hmv = (HmvVehicle) vehicle;
			hmv.getHmvInfo();
			break;

		default:
			System.out.println("Invalid Choice");
		}
	}
}
