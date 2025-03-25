package oops.Polymorphism.oveloading;

public class Overloading_By_Changing_dataType
{
	public static int add(int a, int b)
	{
		System.out.println("int add(int a, int b)");
		return a + b;
	}

	public static double add(double a, double b)
	{
		System.out.println("double add(double a, double b)");
		return a + b;
	}

	public static void main(String[] args)
	{
		System.out.println(add(10, 20));
		System.out.println(add(12.21, 12.1));
	}
}
