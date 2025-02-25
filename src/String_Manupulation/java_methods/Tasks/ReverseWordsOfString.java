package String_Manupulation.java_methods.Tasks;

import java.util.Scanner;

public class ReverseWordsOfString {

	public static void RevWordChar(String str) {
		String[] words = str.split(" ");
		String revStr = "";
		for (int i = str.length() - 1; i >= 0; i--) {
			revStr += str.charAt(i);
		}
//		System.out.println(revStr);
		eachWordsReverse1(revStr);
	}

	public static void eachWordsReverse1(String str) {

		String[] words = str.split(" ");
		String revStrWords = "";

		for (int i = words.length - 1; i >= 0; i--) {
			revStrWords += words[i] + " ";
		}

		System.out.println("Reverse String Words : " + revStrWords);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = "This is java";

//		System.out.println("Enter String: ");
//		String str = sc.nextLine();
//		
		RevWordChar(str);
	}
}
