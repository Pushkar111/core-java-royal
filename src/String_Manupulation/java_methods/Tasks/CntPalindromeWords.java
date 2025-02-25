// Count Palindrome words from scanned string and also print that palindrome words 

package String_Manupulation.java_methods.Tasks;

import java.util.Scanner;

public class CntPalindromeWords {

	public static void CountPalindrome(String str) {
		String[] words = str.split(" ");
		int count = 0;

		for (String word : words) {
			if (isPalindrome(word)) {
				count++;
				System.out.println(word);
			}
		}
		System.out.println("Count Palindrome Words : " + count);
	}

	public static boolean isPalindrome(String name) {
		boolean flag = true;

		for (int i = 0, j = (name.length() - 1); i < name.length(); i++, j--) {
			char a = name.charAt(i);
			char b = name.charAt(j);

			if (a != b) {
				flag = false;
				break;
			}
		}

		if (flag) {
			return flag;
		} else {
			return flag;
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter String: ");
		String str = sc.nextLine();

		CountPalindrome(str);
	}
}
