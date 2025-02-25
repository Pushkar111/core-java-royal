package Java_Inner_Class.not_static_inner_class.Local_inner_class_3;

public class LocalInner2
{

	private int data = 100; // instance variable

	void dispData()
	{

		int value = 50; // Local Variable

		class Local
		{
			void test1()
			{
				System.out.println("Data : " + data);
				System.out.println("value : " + value);
			}
		}

		Local l = new Local();
		l.test1();

	}

	public static void main(String[] args)
	{
		LocalInner2 obj = new LocalInner2();
		obj.dispData();
	}
}
