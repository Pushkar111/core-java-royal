/*
 								Vehicle(getSpec())
 										|
 		-------------------------------------------------------------------------
 		|								|										|
 		TwVehicle					LmvVehicle								HmvVehicle
 		(getSpec())					(getSpec())								(getSpec())
 		(getTwInfo())				(getLmvInfo())							(getHmvInfo())
 					
 */

package oops.Polymorphism.runtime;

public class Vehicle
{
	public void getSpec()
	{
		System.out.println("Vehicle :: getSpec()");
	}
}
