//14) Java Program to Remove Duplicate Words from String
package String_Manupulation.java_methods.RahulSir_Tasks_String;

public class RemoveDuplicateWordsFromString14 {

	public static String RemoveDuplicateWords(String str) {
		String[] words = str.split(" ");
		String result = "";
		boolean flag = false;

		for (int i = 0; i < words.length; i++) {

			flag = false;

			for (int j = 0; j < i; j++) {
				if (words[i].equals(words[j])) {
					flag = true;
					break;
				}
			}

			if (!flag) {
				if (!result.isEmpty()) {
					result += " ";
				}
				result += words[i];
			}
		}

		return result;
	}

	public static void main(String[] args) {
		String str = "John likes to to play basketball with with his his friends every every weekend.";
		String result = RemoveDuplicateWords(str);

		System.out.println("String with duplicate words removed: " + result);

	}
}
