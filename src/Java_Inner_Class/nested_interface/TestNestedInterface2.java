package Java_Inner_Class.nested_interface;

// Example of nested interface which is declared within the class

class A
{
	interface B
	{
		void test1();
	}
}

public class TestNestedInterface2 implements A.B
{

	public void test1()
	{
		System.out.println("test1 :: nested interface with in class");
	}

	public static void main(String[] args)
	{
		A.B obj = new TestNestedInterface2();
		obj.test1();
	}

}
