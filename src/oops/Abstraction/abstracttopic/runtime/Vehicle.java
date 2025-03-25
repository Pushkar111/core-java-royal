/*
			  								[abstract class]
			  										|
			  									Vehicle(public abstract void getSpec(); -- rule)
			  										|
					  			-----------------------------------------
								|					|					|
							TwVehicle			LmvVehicle			HmvVehicle -- abstract class
							getSpec()			getSpec()			abstract void test1();
 
 */

package oops.Abstraction.abstracttopic.runtime;

public abstract class Vehicle
{
	/*
	 * 1) Dm's 2) Abstract Method 3) Non Abstract Method
	 */

	public abstract void getSpec(); // no body

}
