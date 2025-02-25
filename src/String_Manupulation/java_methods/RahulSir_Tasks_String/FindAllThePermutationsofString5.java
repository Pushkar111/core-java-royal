//5) Java Program to Find All the Permutations of a String
// Permutations ==> It involves changing the order of characters while retaining all the original characters. For example, permutations of "ABC" include "ABC," "ACB," "BAC," "BCA," "CAB," and "CBA."
// Permutations are often computed recursively or iteratively, generating all possible orders of the characters in the given string.

// Formula ---> 'n' = n! ; where n = Total string character 
// ex... String str = "ABC"; => ABC, ACB, BCA, BAC, CAB, CBA 			

package String_Manupulation.java_methods.RahulSir_Tasks_String;

public class FindAllThePermutationsofString5 {

	public static void swap(char[] charArr, int i, int j) {
		char temp = charArr[i];
		charArr[i] = charArr[j];
		charArr[j] = temp;
	}

	private static void permutations(char[] charArr, int currentIndex) {
		if (currentIndex == charArr.length - 1) {
			System.out.println(String.valueOf(charArr));
		}

		for (int i = currentIndex; i < charArr.length; i++) {
			swap(charArr, currentIndex, i);
			permutations(charArr, currentIndex + 1);
			swap(charArr, currentIndex, i);
		}
	}

	private static void findPermutations(String str) {
		// base case'
		if (str == null || str.length() == 0) {
			return;
		}

		permutations(str.toCharArray(), 0);
	}

	public static void main(String[] args) {
		String str = "ABC";
		findPermutations(str);
	}

}
