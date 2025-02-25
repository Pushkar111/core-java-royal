//6) Java Program to Count Occurrences of Words in a String

package String_Manupulation.java_methods.RahulSir_Tasks_String;

public class CountOccurrencesOfWordsInString6 {
	public static void countOccurrencesOfWords(String str) {
		String[] words = str.split(" ");
		int[] count = new int[words.length];

		for (int i = 0; i < words.length; i++) {
			int cnt = 0;
			for (int j = 0; j < words.length; j++) {
				if (words[i].equals(words[j])) {
					cnt++;
				}
			}
			count[i] = cnt;
		}

		System.out.println("Words\t\t Occurences");
		System.out.println("---------------------------------");
		for (int i = 0; i < words.length; i++) {
			System.out.println(words[i] + "\t\t\t" + count[i]);
		}
	}

	public static void main(String[] args) {
		String str = "This is a test String to count the occurrences of each word";

		countOccurrencesOfWords(str);

	}
}
