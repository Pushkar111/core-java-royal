package oops.Super;

public class LmvVehicle extends Vehicle
{
	String type = "LmvVehicle";

	LmvVehicle()
	{
		super(); // 2) invoked parent constructor
		System.out.println("LmvVehicle :: Constructor Called");
	}

	@Override
	public void getSpec()
	{
		super.getSpec(); // 3) invoked parent method
		System.out.println("LmvVehicle :: getSpec() -- type - " + type);
		System.out.println("Parent -- type - " + super.type); // 1) refer immidiate parent class instance variable
	}

	public void getLmvInfo()
	{
		System.out.println("LmvVehicle :: getLmvInfo()");
	}
}
