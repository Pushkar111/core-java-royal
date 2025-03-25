package Exception_Handling.Java_throw_keyword_6;

public class TestThrow1
{

	// function to check if person is eligible to vote or not
	public static void validate(int age)
	{
		if (age < 18)
		{
			// throw Arithmetic exception if not eligible to vote
			try
			{
				throw new ArithmeticException("Person is not eligible to vote");
			} catch (Exception e)
			{
				System.out.println(e);
			}
		} else
		{
			System.out.println("Person is eligible to vote!!");
		}
	}

	public static void main(String args[])
	{
		// calling the function
		validate(13);
		System.out.println("rest of the code...");
	}
}