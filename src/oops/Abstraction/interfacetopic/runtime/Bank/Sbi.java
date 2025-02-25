package oops.Abstraction.interfacetopic.runtime.Bank;

public class Sbi implements RbiBank
{
	@Override
	public void getRoi()
	{
		System.out.println("Sbi :: getRoi()");
	}

	public void SbiInfo()
	{
		System.out.println("Sbi :: SbiInfo()");
	}

	@Override
	public void test1()
	{
		System.out.println("Sbi :: test1()");
	}

	@Override
	public void test2()
	{
		System.out.println("Sbi :: test2()");
	}

}
