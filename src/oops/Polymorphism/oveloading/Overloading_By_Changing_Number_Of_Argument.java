package oops.Polymorphism.oveloading;

public class Overloading_By_Changing_Number_Of_Argument
{
	public static int add(int a, int b)
	{
		System.out.println("int add(int a, int b)");
		return a + b;
	}

	public static int add(int a, int b, int c)
	{
		System.out.println("int add(int a, int b, int c)");
		return a + b + c;
	}

	public static void main(String[] args)
	{
		System.out.println(add(10, 20));
		System.out.println(add(10, 20, 30));
	}
}
