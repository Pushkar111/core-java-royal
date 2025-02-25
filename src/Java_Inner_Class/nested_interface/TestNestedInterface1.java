package Java_Inner_Class.nested_interface;

// Example of nested interface which is declared within the interface

interface A
{
	interface B
	{
		void test1();
	}
}

public class TestNestedInterface1 implements A.B
{
	public void test1()
	{
		System.out.println("test1() :: nested interface with in interface");
	}

	public static void main(String[] args)
	{
		A.B obj = new TestNestedInterface1(); // upcasting
		obj.test1();
	}
}
