//Java String split() method with regex and length example 1

package String_Manupulation.java_methods.javaString_split;

public class SplitExample2 {

	public static void main(String[] args) {
		String str = "This is Java Which is Developed By James Gosling";

		System.out.println("split(\"\\\\s\", 0): ");
		String[] words1 = str.split("\\s", 0);
		for (String word : words1) {
			System.out.println(word);
		}
		System.out.println("Split array length: " + words1.length);

		System.out.println("\nsplit(\"\\\\s\", 1): ");
		String[] words2 = str.split("\\s", 1);
		for (String word : words2) {
			System.out.println(word);
		}
		System.out.println("Split array length: " + words2.length);

		System.out.println("\nsplit(\"\\\\s\", 2): ");
		String[] words3 = str.split("\\s", 2);
		for (String word : words3) {
			System.out.println(word);
		}
		System.out.println("Split array length: " + words3.length);

		System.out.println("\nsplit(\"\\\\s\", 3): ");
		String[] words4 = str.split("\\s", 3);
		for (String word : words4) {
			System.out.println(word);
		}
		System.out.println("Split array length: " + words4.length);

	}
}
