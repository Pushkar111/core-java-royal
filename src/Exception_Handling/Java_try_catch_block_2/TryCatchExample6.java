//Let's see an example to resolve the exception in a catch block.

package Exception_Handling.Java_try_catch_block_2;

public class TryCatchExample6 {
	public static void main(String[] args) {
		int i = 50;
		int j = 0;
		int data;
		try {
			data = i / j; // may throw exception
		}
		// handling the exception
		catch (Exception e) {
			// resolving the exception in catch block
			System.out.println(i / (j + 2));
		}
	}
}
