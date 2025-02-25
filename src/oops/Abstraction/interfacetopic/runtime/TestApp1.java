
//Runtime Polymorphism --> aek hi type ke reference variable se kisi bhi object ko hold and surve kar sakte hain

// Compile time --> Vehicle getSpec pe bhejega
// Run time --> Child getSpec pe bhejega

package oops.Abstraction.interfacetopic.runtime;

import java.util.Scanner;

public class TestApp1
{

	public static void main(String[] args)
	{

		Scanner sc = new Scanner(System.in);

		System.out.println("1. TwVehicle");
		System.out.println("2. LmvVehicle");
		System.out.println("3. HmvVehicle");

		System.out.println("Enter the Choice : ");
		int choice = sc.nextInt();

		Vehicle vehicle = null;

		switch (choice)
		{
		case 1:
			// Polymorphic Object --> UpCasting
			// ChildReference Variable converts into ParentReference Variable
			// ParentReference = new ChildObject();
			vehicle = new TwVehicle();
			vehicle.getSpec();

			// Polymorphic Object --> DownCasting
			// ParentReference Variable converts into ChildReference Variable
			TwVehicle twObj = (TwVehicle) vehicle;
			twObj.getTwInfo();
			break;

		case 2:
			vehicle = new LmvVehicle();
			vehicle.getSpec();

			LmvVehicle lmvObj = (LmvVehicle) vehicle;
			lmvObj.getLmvInfo();
			break;

		case 3:
			vehicle = new HmvVehicle();
			vehicle.getSpec();

			HmvVehicle hmvObj = (HmvVehicle) vehicle;
			hmvObj.getHmvInfo();
			break;

		default:
			System.out.println("Invalid Choice");
			break;
		}
	}

}
