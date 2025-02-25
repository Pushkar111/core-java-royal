//	Case 2: When an exception occurr but not handled by the catch block
//	-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-==-=-=-=-=-=-=-=-=-=-=-=
//	► Let's see the the fillowing example. Here, the code throws an exception however the catch block cannot handle it. Despite this, the finally block is executed after the try block and then the program terminates abnormally.

package Exception_Handling.Java_finally_block_5;

public class TestFinallyBlock2 {
	public static void main(String args[]) {
		try {
			System.out.println("Inside the try block");

			// below code throws divide by zero exception
			int data = 25 / 0;
			System.out.println(data);
		}
		// cannot handle Arithmetic type exception
		// can only accept Null Pointer type exception
		catch (NullPointerException e) {
			System.out.println(e);
		}
		// executes regardless of exception occured or not
		finally {
			System.out.println("finally block is always executed");
		}

		System.out.println("rest of the code...");
	}
}
