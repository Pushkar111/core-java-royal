package oops.Polymorphism.runtime.practice;

public class LmvVehicle extends Vehicle
{
	@Override
	public void getSpec()
	{
		System.out.println("LmvVehicle : getSpec()");
	}

	public void getLmvInfo()
	{
		System.out.println("LmvVehicle : getLmvInfo()");
	}
}
