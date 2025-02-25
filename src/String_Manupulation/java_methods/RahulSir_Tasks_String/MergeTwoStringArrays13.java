// 13) Java Program to Merge Two String Arrays

package String_Manupulation.java_methods.RahulSir_Tasks_String;

public class MergeTwoStringArrays13 {

	public static int[] mergeTwoArrs(int[] a, int[] b) {

		int[] c = new int[a.length + b.length];

		for (int i = 0; i < a.length; i++) {
			c[i] = a[i];
		}

		for (int i = 0; i < b.length; i++) {
			c[a.length + i] = b[i];
		}

		return c;
	}

	public static void main(String[] args) {
		int[] a = { 1, 2, 3, 4, 5 };
		int[] b = { 6, 7, 8, 9, 10 };

		System.out.println("\nArray A");
		System.out.println("--------------------------------------");
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");
		}

		System.out.println("\n\nArray B");
		System.out.println("--------------------------------------");
		for (int i = 0; i < b.length; i++) {
			System.out.print(b[i] + " ");
		}

		int[] c = mergeTwoArrs(a, b);

		System.out.println("\n\nArray C");
		System.out.println("--------------------------------------");
		for (int i = 0; i < c.length; i++) {
			System.out.print(c[i] + " ");
		}
	}
}
