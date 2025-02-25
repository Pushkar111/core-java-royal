//11) Java Program to Count the Number of Occurrences of Substring in a String

package String_Manupulation.java_methods.RahulSir_Tasks_String;

public class CountNumberOfOccurrencesOfSubstringInString11 {

	public static int CountSubstringOccurrences(String str, String subStr) {

		int count = 0;
		int index = 0;

		while ((index = str.indexOf(subStr, index)) != -1) {
			count++;
			index = index + subStr.length();
		}

		return count;
	}

	public static void main(String[] args) {
		String str = "This is the Example of Program of Java";
		String subStr = "of";

		int count = CountSubstringOccurrences(str, subStr);
		System.out.println("Substring\t\tOccurrences");
		System.out.println("---------\t\t-----------");
		System.out.println(subStr + "\t\t\t" + count);
	}
}
