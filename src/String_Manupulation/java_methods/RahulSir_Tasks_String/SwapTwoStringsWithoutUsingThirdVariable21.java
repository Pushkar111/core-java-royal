//21) Java Program to Swap Two Strings Without Using Third Variable

package String_Manupulation.java_methods.RahulSir_Tasks_String;

public class SwapTwoStringsWithoutUsingThirdVariable21 {

	public static void main(String[] args) {
		String str1 = "How are you";
		String str2 = "I am Fine";

		System.out.println("Before swapping:");
		System.out.println("String 1: " + str1);
		System.out.println("String 2: " + str2);

		str1 = str1 + str2;
		str2 = str1.substring(0, str1.length() - str2.length());
		str1 = str1.substring(str2.length());

		System.out.println("\nAfter swapping:");
		System.out.println("String 1: " + str1);
		System.out.println("String 2: " + str2);
	}
}
