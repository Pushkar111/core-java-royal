package oops.Super;

/*
Usage of java super keyword 
---------------------------
1) Refer to immediate parent class instance variable
2) Invoke immediate parent class constructor
3) Invoke immediate parent class method

 */

public class Vehicle
{
	String type = "Vehicle";

	Vehicle()
	{
		System.out.println("Vehicle :: Constructor Called");
	}

	public void getSpec()
	{
		System.out.println("Vehicle :: getSpec() -- type - " + type);
	}
}
