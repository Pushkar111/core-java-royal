// Solution by exception handling
// Let's see the solution of the above problem by a java try-catch block.

package Exception_Handling.Java_try_catch_block_2;

public class TryCatchExample2 {
	public static void main(String[] args) {
		try {
			int data = 50 / 0; // may throw exception
		}
		// handling the exception
		catch (ArithmeticException e) {
			System.out.println(e);
			e.printStackTrace();
		}
		System.out.println("rest of the code");
	}

}
