package oops.Polymorphism.runtime.practice;

import java.util.Scanner;

public class TestApp2
{
	public static void getVehicleInfo(Vehicle vehicle)
	{
		if (vehicle instanceof TwVehicle)
		{
			TwVehicle tw = (TwVehicle) vehicle;
			tw.getSpec();
			tw.getTwInfo();
		} else if (vehicle instanceof LmvVehicle)
		{
			LmvVehicle lmv = (LmvVehicle) vehicle;
			lmv.getSpec();
			lmv.getLmvInfo();
		} else if (vehicle instanceof HmvVehicle)
		{
			HmvVehicle hmv = (HmvVehicle) vehicle;
			hmv.getSpec();
			hmv.getHmvInfo();
		}
	}

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
		case 1:
			TwVehicle tw = new TwVehicle();
			getVehicleInfo(tw);
			break;
		case 2:
			LmvVehicle lmv = new LmvVehicle();
			getVehicleInfo(lmv);
			break;
		case 3:
			HmvVehicle hmv = new HmvVehicle();
			getVehicleInfo(hmv);
			break;

		default:
			System.out.println("Invalid choice");
		}
	}
}
