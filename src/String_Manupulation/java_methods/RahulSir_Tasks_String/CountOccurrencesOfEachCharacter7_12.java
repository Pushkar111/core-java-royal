//7) Java Program to Count the Occurrences of Each Character

//12) Java Program to Count the Occurrences of Each Character in String

package String_Manupulation.java_methods.RahulSir_Tasks_String;

public class CountOccurrencesOfEachCharacter7_12 {
	public static void countCharOccurrences(String str) {

		int[] count = new int[256];

		for (int i = 0; i < str.length(); i++) {
			char c = str.charAt(i);
			count[c]++;
		}

		System.out.println("Character\t\tCount");
		System.out.println("----------\t\t-----");
		for (int i = 0; i < 256; i++) {
			if (count[i] > 0) {
				System.out.println((char) i + "\t\t\t" + count[i]);
			}
		}
	}

	public static void main(String[] args) {
		String str = "Hello World";

		countCharOccurrences(str);
	}
}
