package Exception_Handling.AbstractClass;

// abstract class not created object it must be enherited in child 
abstract class Vehicle
{
	public abstract void getSpec();
}

class TwVehicle extends Vehicle
{
	@Override
	public void getSpec()
	{
		System.out.println("TwVehicle :: getSpec()");
	}
}

class LmvVehicle extends Vehicle
{
	@Override
	public void getSpec()
	{
		System.out.println("LmvVehicle :: getSpec()");
	}
}

class HmvVehicle extends Vehicle
{
	@Override
	public void getSpec()
	{
		System.out.println("HmvVehicle :: getSpec()");
	}
}

public class Demo1
{
	public static void main(String[] args)
	{

//		Vehicle vehicle = new Vehicle(); // C.T - ERROR
//		vehicle.getSpec();

		Vehicle vehicle = null;
		vehicle = new TwVehicle();
		vehicle.getSpec();

		vehicle = new LmvVehicle();
		vehicle.getSpec();

		vehicle = new HmvVehicle();
		vehicle.getSpec();

	}
}
