package oops.Super;

public class TwVehicle extends Vehicle
{
	String type = "TwVehicle";

	TwVehicle()
	{
		super(); // 2) invoked parent constructor
		System.out.println("TwVehicle :: Constructor Called");
	}

	@Override
	public void getSpec()
	{
		super.getSpec(); // 3) invoked parent method
		System.out.println("TwVehicle :: getSpec() -- type - " + type);
		System.out.println("Parent -- type - " + super.type); // 1) refer immidiate parent class instance variable
	}

	public void getTwInfo()
	{
		System.out.println("TwVehicle :: getTwInfo()");
	}
}
