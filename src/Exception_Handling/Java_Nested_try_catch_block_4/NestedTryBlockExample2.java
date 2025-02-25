package Exception_Handling.Java_Nested_try_catch_block_4;

public class NestedTryBlockExample2 {
	public static void main(String args[]) {
		// outer (main) try block
		try {
			// inner try block 1
			try {
				// inner try block 2
				try {
					System.out.println("printing the array element out of its bounds");
					int arr[] = { 1, 2, 3, 4 };
					System.out.println(arr[10]);
				}
				// to handles ArithmeticException
				catch (ArithmeticException e) {
					System.out.println("Arithmetic exception");
					System.out.println(" inner try block 2");
				}
			}

			// to handle ArithmeticException
			catch (ArithmeticException e) {
				System.out.println("Arithmetic exception");
				System.out.println("inner try block 1");
			}
		}

		// to handle ArrayIndexOutOfBoundsException
		catch (ArrayIndexOutOfBoundsException e4) {
			System.out.print(e4);
			System.out.println(" outer (main) try block");
		} catch (Exception e5) {
			System.out.print("Exception");
			System.out.println(" handled in main try-block");
		}
	}
}
