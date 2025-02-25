//In this example, we handle the generated exception (Arithmetic Exception) with a different type of exception class (ArrayIndexOutOfBoundsException).

package Exception_Handling.Java_try_catch_block_2;

public class TryCatchExample8 {
	public static void main(String[] args) {
		try {
			int data = 50 / 0; // may throw exception
		}
		// try to handle the ArithmeticException using ArrayIndexOutOfBoundsException
		catch (ArrayIndexOutOfBoundsException e) {
			System.out.println(e);
		}
		System.out.println("rest of the code");
	}
}
