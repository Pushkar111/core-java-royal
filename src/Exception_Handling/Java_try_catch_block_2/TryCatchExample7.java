//In this example, along with try block, we also enclose exception code in a catch block.

package Exception_Handling.Java_try_catch_block_2;

public class TryCatchExample7 {
	public static void main(String[] args) {
		try {
			int data1 = 50 / 0; // may throw exception
		}
		// handling the exception
		catch (Exception e) {
			// generating the exception in catch block
			int data2 = 50 / 0; // may throw exception
		}
		System.out.println("rest of the code");
	}
}
