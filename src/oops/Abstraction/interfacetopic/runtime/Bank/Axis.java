package oops.Abstraction.interfacetopic.runtime.Bank;

public class Axis implements RbiBank
{
	@Override
	public void getRoi()
	{
		System.out.println("Axis :: getRoi()");
	}

	public void AxisInfo()
	{
		System.out.println("Axis :: AxisInfo()");
	}

	@Override
	public void test1()
	{
		System.out.println("Axis :: test1()");
	}

	@Override
	public void test2()
	{
		System.out.println("Axis :: test2()");
	}
}
