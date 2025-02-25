//Here, we handle the exception using the parent class exception.

package Exception_Handling.Java_try_catch_block_2;

public class TryCatchExample4 {
	public static void main(String[] args) {
		try {
			int data = 50 / 0; // may throw exception
		}
		// handling the exception by using Exception class
		catch (Exception e) {
			System.out.println(e);
		}
		System.out.println("rest of the code");
	}

}
