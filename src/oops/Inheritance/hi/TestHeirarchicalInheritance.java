package oops.Inheritance.hi;

class A
{
	void test1()
	{
		System.out.println("A :: test1()");
	}
}

class B extends A
{
	void test2()
	{
		System.out.println("B :: test2()");
	}
}

class C extends A
{
	void test3()
	{
		System.out.println("C :: test3()");
	}
}

public class TestHeirarchicalInheritance
{
	public static void main(String[] args)
	{
		C obj = new C();

		obj.test1();
//		obj.test2(); --> Compile-Time Error
		obj.test3();
	}
}
