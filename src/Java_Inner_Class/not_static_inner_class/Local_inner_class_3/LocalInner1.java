package Java_Inner_Class.not_static_inner_class.Local_inner_class_3;

public class LocalInner1
{

	private int data = 100; // instance Variable

	void dispData()
	{
		class Local
		{
			void test1()
			{
				System.out.println("Data : " + data);
			}
		}
		Local l = new Local();
		l.test1();
	}

	public static void main(String[] args)
	{
		LocalInner1 obj = new LocalInner1();
		obj.dispData();

	}
}
