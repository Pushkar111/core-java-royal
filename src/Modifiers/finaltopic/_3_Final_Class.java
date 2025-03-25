package Modifiers.finaltopic;

final class Bike
{

}

class _3_Final_Class extends Bike // cannot be extends final class
{
	void run()
	{
		System.out.println("_3_Final_Class :: run()");
	}

	public static void main(String[] args)
	{
		_3_Final_Class obj = new _3_Final_Class();

		obj.run();
	}
}
