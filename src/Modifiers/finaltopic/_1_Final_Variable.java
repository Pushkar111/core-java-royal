package Modifiers.finaltopic;

public class _1_Final_Variable
{
	final int speedLimit = 100;

	void run()
	{
		speedLimit = 400; // show error bcz of final variable value does not changed
	}

	public static void main(String[] args)
	{
		_1_Final_Variable obj = new _1_Final_Variable();

		obj.run();

	}
}
