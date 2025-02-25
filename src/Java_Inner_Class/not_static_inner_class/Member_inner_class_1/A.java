package Java_Inner_Class.not_static_inner_class.Member_inner_class_1;

// A non-static class that is created inside a class but outside a method is called member inner class.

public class A
{

	private int no = 100;

	class B
	{

		void disp()
		{
			System.out.println("No: " + no);
		}

	}

	public static void main(String[] args)
	{
		A objA = new A();

		A.B objB = objA.new B();

		objB.disp();
	}

}
