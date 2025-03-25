package oops.Polymorphism.runtime.practice;

public class HmvVehicle extends Vehicle
{
	@Override
	public void getSpec()
	{
		System.out.println("HmvVehicle : getSpec()");
	}

	public void getHmvInfo()
	{
		System.out.println("HmvVehicle : getHmvInfo()");
	}
}
