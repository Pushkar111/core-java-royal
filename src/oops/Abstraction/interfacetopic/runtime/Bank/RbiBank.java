package oops.Abstraction.interfacetopic.runtime.Bank;

public interface RbiBank
{
//  1) Constant Variable -- [By Default : public static final]
	int NO = 10;

//	2) Abstract Methods -- [public abstract]
	public abstract void test1();

	public abstract void test2();

	void getRoi(); // [By Default : public abstract] By Compiler

//  3) Non-abstract Methods -- java-8 [default(8th), static(8th), private(9th)]
	default void test3()
	{
		// operation part
		test5();
		System.out.println("RbiBank -- default -- test3()");
	}

	static void test4()
	{
		System.out.println("RbiBank -- static -- test4()");
	}

	private void test5()
	{
		System.out.println("RbiBank -- private -- test5()");
	}

}
