//9) Java program to Count the Number of Duplicate Words in a String

package String_Manupulation.java_methods.RahulSir_Tasks_String;

public class CountNumberOfDuplicateWordsInString9 {

	public static void CountDuplicateWords(String str) {

		String[] words = str.split(" ");
		int[] count = new int[words.length];
		int dup = 0;

		for (int i = 0; i < words.length; i++) {
			for (int j = 0; j < words.length; j++) {
				if (i != j && words[i].equals(words[j])) {
					count[i]++;
				}
			}
		}

		for (int i = 0; i < words.length; i++) {
			if (count[i] > 0) {
				dup++;
			}
		}

		System.out.println("Number of Duplicate Words : " + dup);
	}

	public static void main(String[] args) {
		String str = "This is java which is Developedd By James Gosling";

		CountDuplicateWords(str);
	}
}
