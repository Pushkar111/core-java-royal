// Problem without exception handling
// Let's try to understand the problem if we don't use a try-catch block.

package Exception_Handling.Java_try_catch_block_2;

public class TryCatchExample1 {
	public static void main(String[] args) {

		int data = 50 / 0; // may throw exception

		System.out.println("rest of the code");

	}
}
