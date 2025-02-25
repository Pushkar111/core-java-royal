package oops.Abstraction.interfacetopic.runtime.Bank;

public class Bob implements RbiBank
{
	@Override
	public void getRoi()
	{
		System.out.println("Bob :: getRoi()");
	}

	public void BobInfo()
	{
		System.out.println("Bob :: BobInfo()");
	}

	@Override
	public void test1()
	{
		System.out.println("Bob :: test1()");
	}

	@Override
	public void test2()
	{
		System.out.println("Bob :: test2()");
	}

}
