/*
 								Vehicle(getSpec())
 										|
 						-------------------------------------
 						|				|					|
 					TwVehicle		LmvVehicle		HmvVehicle
 					(getSpec())		(getSpec())		(getSpec())
 
 */

package oops.Polymorphism.runtime;

public class Vehicle {

	public void getSpec() {
		System.out.println("Vehicle :: getSpec()");
	}
}
