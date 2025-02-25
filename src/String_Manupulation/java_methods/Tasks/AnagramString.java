//25) Java String Program to Check Anagram

package String_Manupulation.java_methods.Tasks;

import java.util.Arrays;

public class AnagramString {
	public static void main(String[] args) {
		String str1 = "silent";
		String str2 = "listen";

		if (str1.length() != str2.length()) {
			System.out.println("The strings are not anagrams.");
		} else {
			char charArray1[] = str1.toCharArray();
			char charArray2[] = str2.toCharArray();

			Arrays.sort(charArray1);
			Arrays.sort(charArray2);

			if (Arrays.equals(charArray1, charArray2)) {
				System.out.println("The strings are anagrams.");
			} else {
				System.out.println("The strings are not anagrams.");
			}

		}
	}
}
