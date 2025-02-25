package Java_Inner_Class.static_inner_class;

// Java static nested class example with static method

public class TestOuter2_static_method
{
	static int data = 100; // instance variable

	static class Inner
	{
		static void test1() // static method
		{
			System.out.println("Data : " + data);
		}

	}

	public static void main(String[] args)
	{
		TestOuter2_static_method.Inner.test1();
	}
}
