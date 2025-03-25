package Modifiers.finaltopic;

public class TestApp2
{

	// 3 Ways to initialize variable

	// (1) Local Variable
	final int no1;

	// (2) using Constructor
	public TestApp2()
	{
		no1 = 100;
	}

	// (3) using Constructor with Parameter
	public TestApp2(int no1)
	{
		this.no1 = no1;
	}

	public static void main(String[] args)
	{
		TestApp2 obj1 = new TestApp2();
		TestApp2 obj2 = new TestApp2();
		TestApp2 obj3 = new TestApp2(200);

		System.out.println("obj1.no1 = " + obj1.no1);
		System.out.println("obj2.no1 = " + obj2.no1);
		System.out.println("obj3.no1 = " + obj3.no1);
	}

}
