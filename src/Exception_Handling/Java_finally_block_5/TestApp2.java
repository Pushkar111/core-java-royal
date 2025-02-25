package Exception_Handling.Java_finally_block_5;

public class TestApp2 {
	public static void main(String[] args) {
		int[] a = new int[5];

		try {
			a[10] = 100;
		} catch (Exception e) {
			System.out.println("Exception Handled -- " + e.getClass().getName());
		} finally {
			System.out.println("finally block always executed");
		}

		System.out.println("--------------General Statement--------------");

	}
}
