package Exception_Handling.Java_Nested_try_catch_block_4;

public class NestedTryBlockExample1 {
	public static void main(String args[]) {
		// outer try block
		try {
			// inner try block 1
			try {
				System.out.println("going to divide by 0");
				int ans = 39 / 0;
			}
			// catch block of inner try block 1
			catch (ArithmeticException e) {
				System.out.println(e);
			}

			// inner try block 2
			try {
				System.out.println("assigning the value out of array bounds");
				int a[] = new int[5];
				a[5] = 4;
			}
			// catch block of inner try block 2
			catch (ArrayIndexOutOfBoundsException e) {
				System.out.println(e);
			}

			System.out.println("other statement");
		}
		// catch block of outer try block
		catch (Exception e) {
			System.out.println("handled the exception (outer catch)");
		}

		System.out.println("-----General Statement-----");
	}
}
