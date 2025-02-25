//4) Java Program to Find Duplicate Words in a String

package String_Manupulation.java_methods.RahulSir_Tasks_String;

public class FindDuplicateWordsInString4 {
	public static void main(String[] args) {
		String str = "John likes to play tennis, but John prefers swimming";
		String[] allWords = str.toLowerCase().split(" ");

		System.out.println("Duplicate Words are : \n");
		for (int i = 0; i < allWords.length; i++) {
			for (int j = i + 1; j < allWords.length; j++) {
				if (allWords[i].equals(allWords[j])) {
					System.out.println(allWords[i]);
					break;
				}
			}
		}
	}
}
