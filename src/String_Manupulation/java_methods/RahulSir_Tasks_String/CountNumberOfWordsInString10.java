//10) Java Program to Count Number of Words in Given String

package String_Manupulation.java_methods.RahulSir_Tasks_String;

import java.util.StringTokenizer;

public class CountNumberOfWordsInString10 {

	public static void CountWords(String str) {
		String[] words = str.split(" ");
		int count = 0;

		for (int i = 0; i < words.length; i++) {
			count++;
		}

		System.out.println("Number of words: " + count);
	}

	public static void main(String[] args) {
		String str = "Hello World This is me";
		CountWords(str);

		System.out.println("-------------------------");

		StringTokenizer st = new StringTokenizer(str);
		System.out.println("Count Tokens: " + st.countTokens());
	}
}
