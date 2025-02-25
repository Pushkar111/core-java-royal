//16) Java Program to Reverse Each Word of a String

package String_Manupulation.java_methods.RahulSir_Tasks_String;

public class ReverseEachWordOfString16 {

	public static void eachWordsReverse1(String str) {

		String[] words = str.split(" ");
		String revStrWords = "";

		for (int i = words.length - 1; i >= 0; i--) {
			revStrWords += words[i] + " ";
		}

		System.out.println("Reverse String Words : " + revStrWords);
	}

	public static void main(String[] args) {
		String str = "Hello World";
		eachWordsReverse1(str);
	}
}
