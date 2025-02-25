//Java String indexOf(String substring, int fromIndex) Method Example 3

package String_Manupulation.java_methods.javaString_indexOf;

public class IndexOfExample3 {
	public static void main(String[] args) {
//					 0123456789012345678901
		String s1 = "This is indexOf method";

		// Passing Substring and index
		int index = s1.indexOf("method", 10); // Returns the index of this substring
		System.out.println("index of substring: " + index);

		index = s1.indexOf("method", 20); // It returns -1 if substring does not found
		System.out.println("index of substring: " + index);

	}
}
