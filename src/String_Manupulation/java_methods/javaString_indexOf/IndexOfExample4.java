//Java String indexOf(int char, int fromIndex) Method Example 4

package String_Manupulation.java_methods.javaString_indexOf;

public class IndexOfExample4 {
	public static void main(String[] args) {
//					 0123456789012345678901
		String s1 = "This is indexOf method";

		// Passing char and indexFrom
		int index = s1.indexOf('e', 12);// Returns the index of this char
		System.out.println("index of char: " + index);
	}
}
