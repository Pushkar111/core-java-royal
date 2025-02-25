package Java_Inner_Class.not_static_inner_class.Member_inner_class_1;

public class TestMemberOuter1
{
	private int data = 100;

	class inner
	{
		void disp()
		{
			System.out.println("Data: " + data);
		}
	}

	public static void main(String[] args)
	{

		TestMemberOuter1 objOuter = new TestMemberOuter1();
		TestMemberOuter1.inner objInner = objOuter.new inner();
		objInner.disp();

	}
}
