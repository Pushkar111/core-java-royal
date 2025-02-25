//Java String indexOf() Method Example 1

package String_Manupulation.java_methods.javaString_indexOf;

public class IndexOfExample1 {
	public static void main(String[] args) {
		String s1 = "this is index of example";

		// pass Substring
		int index1 = s1.indexOf("is"); // returns the index of is substring
		int index2 = s1.indexOf("index"); // returns the index of is substring

		System.out.println("index1: " + index1 + "\nindex2: " + index2);

		// passing substring with from index
		int index3 = s1.indexOf("is", 4); // returns the index of is substring after 4th index
		System.out.println("index3: " + index3); // 5 i.e. the index of another is

		// passing char value
		int index4 = s1.indexOf('s'); // returns the index of s char value
		System.out.println("index4: " + index4); // 3
	}
}
