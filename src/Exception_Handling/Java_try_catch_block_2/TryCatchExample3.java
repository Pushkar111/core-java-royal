//In this example, we also kept the code in a try block that will not throw an exception.

package Exception_Handling.Java_try_catch_block_2;

public class TryCatchExample3 {
	public static void main(String[] args) {
		try {
			int data = 50 / 0; // may throw exception
			// if exception occurs, the remaining statement will not exceute
			System.out.println("rest of the code");
		}
		// handling the exception
		catch (ArithmeticException e) {
			System.out.println(e);
		}

	}
}
