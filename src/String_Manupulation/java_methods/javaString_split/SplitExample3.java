//Java String split() method with regex and length example 2
/*
	Here, we are passing split limit as a second argument to this function. This limits the number of splitted strings.
 */

package String_Manupulation.java_methods.javaString_split;

public class SplitExample3 {

	public static void main(String[] args) {
		String str = "Royal Technosoft P Limited";
		System.out.println("split(\"P\", 0)");
		String[] words = str.split("P", 0);
		for (String word : words) {
			System.out.println(word);
		}
		System.out.println("Split array length: " + words.length);

	}

}
