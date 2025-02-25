//Let's see an example to print a custom message on exception.

package Exception_Handling.Java_try_catch_block_2;

public class TryCatchExample5 {
	public static void main(String[] args) {
		try {
			int data = 50 / 0; // may throw exception
		}
		// handling the exception
		catch (Exception e) {
			// displaying the custom message
			System.out.println("Can't divided by zero");
		}
	}
}
