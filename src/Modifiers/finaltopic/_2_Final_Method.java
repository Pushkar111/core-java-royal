package Modifiers.finaltopic;

class Bike
{
	final void run()
	{
		System.out.println("Bike :: Final run()");
	}
}

public class _2_Final_Method extends Bike
{
	void run() // cannot override
	{
		System.out.println("_2_Final_Method :: run()");
	}

	public static void main(String[] args)
	{
		_2_Final_Method obj = new _2_Final_Method();

		obj.run();
	}
}
