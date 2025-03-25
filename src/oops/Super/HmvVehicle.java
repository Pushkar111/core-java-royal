package oops.Super;

public class HmvVehicle extends Vehicle
{
	String type = "HmvVehicle";

	HmvVehicle()
	{
		super(); // 2) invoked parent constructor
		System.out.println("HmvVehicle :: Constructor Called");
	}

	@Override
	public void getSpec()
	{
		super.getSpec(); // 3) invoked parent method
		System.out.println("HmvVehicle :: getSpec() -- type - " + type);
		System.out.println("Parent -- type - " + super.type); // 1) refer immidiate parent class instance variable
	}

	public void getHmvInfo()
	{
		System.out.println("HmvVehicle :: getHmvInfo()");
	}
}
