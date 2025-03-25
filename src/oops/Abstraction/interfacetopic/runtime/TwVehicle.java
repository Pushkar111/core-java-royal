package oops.Abstraction.interfacetopic.runtime;

public class TwVehicle implements Vehicle
{
	@Override
	public void getSpec()
	{
		System.out.println("TwVehicle :: getSpec()");
	}

	public void getTwInfo()
	{
		System.out.println("TwVehicle :: getTwInfo()");
	}

	@Override
	public void test1()
	{
		System.out.println("TwVehicle :: test1()");
	}

	@Override
	public void test2()
	{
		System.out.println("TwVehicle :: test2()");
	}
}
