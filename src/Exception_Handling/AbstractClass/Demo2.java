package Exception_Handling.AbstractClass;

abstract class Bike
{
	int speed = 90;

	Bike()
	{
		System.out.println("Bike is Created....");
	}

	abstract void run();

	final void changeGear()
	{
		System.out.println("Gear Change");
	}
}

class HeroBike extends Bike
{
	@Override
	void run()
	{
		System.out.println("HeroBike is running with speed " + speed);
	}
}

class HondaBike extends Bike
{
	@Override
	void run()
	{
		System.out.println("HondaBike is running with speed " + speed);
	}
}

public class Demo2
{
	public static void main(String[] args)
	{
		Bike b1 = new HeroBike();
		b1.run();
		b1.changeGear();

		Bike b2 = new HondaBike();
		b2.run();
		b2.changeGear();
	}
}
