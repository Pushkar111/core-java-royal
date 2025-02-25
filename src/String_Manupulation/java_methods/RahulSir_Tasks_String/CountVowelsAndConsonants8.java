//8) Java Program to Count Vowels and Consonants in a String

package String_Manupulation.java_methods.RahulSir_Tasks_String;

public class CountVowelsAndConsonants8 {

	public static void countVowelsAndConsonants(String str) {
		int vowels = 0, consonents = 0;

		for (int i = 0; i < str.length(); i++) {

			char c = Character.toLowerCase(str.charAt(i));

			if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
				vowels++;
			} else if (c >= 'a' && c <= 'z') {
				consonents++;
			}
		}

		System.out.println("vowels: " + vowels);
		System.out.println("consonents: " + consonents);
	}

	public static void main(String[] args) {
		String str = "Hello World";

		countVowelsAndConsonants(str);
	}
}
