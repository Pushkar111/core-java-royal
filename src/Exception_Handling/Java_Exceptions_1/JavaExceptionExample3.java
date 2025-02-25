// ArrayIndexOutOfBoundsException

package Exception_Handling.Java_Exceptions_1;

public class JavaExceptionExample3 {
	public static void main(String[] args) {

		int[] a = new int[5]; // a[0] ... a[4]
		a[5] = 100;
		System.out.println(a[5]);
	}
}
