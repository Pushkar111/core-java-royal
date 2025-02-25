package Java_Inner_Class.static_inner_class;

// Java static nested class example with instance method

public class TestOuter1_instance_method
{
	static int data = 100; // instance variable

	static class Inner
	{
		void test1() // instance method
		{
			System.out.println("Data : " + data);
		}

	}

	public static void main(String[] args)
	{
		TestOuter1_instance_method.Inner obj = new TestOuter1_instance_method.Inner();
		obj.test1();
	}
}
