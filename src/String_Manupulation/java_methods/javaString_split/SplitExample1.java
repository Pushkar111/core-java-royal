package String_Manupulation.java_methods.javaString_split;

public class SplitExample1 {
	public static void main(String[] args) {
		String str = "This is Java Which is Developed By James Gosling";

		String[] words = str.split("\\s");// splits the string based on whitespace

		for (String word : words) {
			System.out.println(word);
		}

	}
}
