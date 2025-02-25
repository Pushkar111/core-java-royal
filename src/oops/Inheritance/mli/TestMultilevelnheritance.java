package oops.Inheritance.mli;

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

class C extends B
{
	void test3()
	{
		System.out.println("C :: test3()");
	}
}

public class TestMultilevelnheritance
{
	public static void main(String[] args)
	{
		C obj = new C();
		obj.test1();
		obj.test2();
		obj.test3();
	}
}
