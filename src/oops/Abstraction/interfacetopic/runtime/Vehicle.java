/*
  									interface
  										|
 								Vehicle(getSpec())  - interface -- [constant variable , abstract methods, non-abstract methods]
 										|
 						-------------------------------------
 						|				|					|
 					TwVehicle		LmvVehicle		HmvVehicle
 					(getSpec())		(getSpec())		(getSpec())
 
 */

package oops.Abstraction.interfacetopic.runtime;

public interface Vehicle
{

//  1) Constant Variable -- [By Default : public static final]
	int NO = 10;

//	2) Abstract Methods -- [public abstract]
	public abstract void test1();

	public abstract void test2();

	void getSpec(); // [By Default : public abstract] By Compiler

//  3) Non-abstract Methods -- after java-8 allows [default(8th), static(8th), private(9th)]
	default void test3()
	{
		// operation part
		test5();
		System.out.println("Vehicle -- default -- test3()");
	}

	static void test4()
	{
		System.out.println("Vehicle -- static -- test4()");
	}

	private void test5()
	{
		System.out.println("Vehicle -- private -- test5()");
	}
}
