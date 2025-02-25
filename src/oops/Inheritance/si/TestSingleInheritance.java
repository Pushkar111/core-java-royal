package oops.Inheritance.si;

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

public class TestSingleInheritance
{
	public static void main(String[] args)
	{
		B obj = new B();
		obj.test1();
		obj.test2();
	}

}
