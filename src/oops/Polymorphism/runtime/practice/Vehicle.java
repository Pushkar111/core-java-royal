package oops.Polymorphism.runtime.practice;

/*
										Vehicle
									  (getSpec())
									  		|
				---------------------------------------------------------
				|							|							|
			TwVehicle					LmvVehicle					HmvVehicle
			(getSpec())					(getSpec())					(getSpec())
			(getTwInfo())				(getLmvInfo())				(getHmvInfo())
	
	
	
*/

public class Vehicle
{
	public void getSpec()
	{
		System.out.println("Vehicle : getSpec()");
	}
}
