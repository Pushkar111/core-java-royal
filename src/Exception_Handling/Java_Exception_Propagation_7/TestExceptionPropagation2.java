package Exception_Handling.Java_Exception_Propagation_7;

public class TestExceptionPropagation2
{
	// compile time error
	void m()
	{
		throw new java.io.IOException("device error");// checked exception
	}

	void n()
	{
		m();
	}

	void p()
	{
		try
		{
			n();
		} catch (Exception e)
		{
			System.out.println("exception handeled");
		}
	}

	public static void main(String args[])
	{
		TestExceptionPropagation2 obj = new TestExceptionPropagation2();
		obj.p();
		System.out.println("normal flow");
	}
}
