package oops.Abstraction.interfacetopic.runtime;

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
			tw.test1();
			tw.test2();
			tw.test3();
		} else if (vehicle instanceof LmvVehicle)
		{
			LmvVehicle lmv = (LmvVehicle) vehicle;
			lmv.getSpec();
			lmv.getLmvInfo();
			lmv.test1();
			lmv.test2();
			lmv.test3();
		} else if (vehicle instanceof HmvVehicle)
		{
			HmvVehicle hmv = (HmvVehicle) vehicle;
			hmv.getSpec();
			hmv.getHmvInfo();
			hmv.test1();
			hmv.test2();
			hmv.test3();
		}
	}

	public static void main(String[] args)
	{
		Vehicle vehicle = null;

		Scanner sc = new Scanner(System.in);

		System.out.println("1. TwVehicle");
		System.out.println("2. LmvVehicle");
		System.out.println("3. HmvVehicle");

		System.out.println("Enter the Choice : ");
		int choice = sc.nextInt();

		switch (choice)
		{
		case 1:
			TwVehicle twObj = new TwVehicle();
			getVehicleInfo(twObj);
			break;

		case 2:
			LmvVehicle lmvObj = new LmvVehicle();
			getVehicleInfo(lmvObj);
			break;

		case 3:
			HmvVehicle hmvObj = new HmvVehicle();
			getVehicleInfo(hmvObj);
			break;

		default:
			System.out.println("Invalid Choice");
			break;
		}
		Vehicle.test4();
	}

}
