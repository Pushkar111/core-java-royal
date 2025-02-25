//17) Java Program to Swap Two Strings +

package String_Manupulation.java_methods.RahulSir_Tasks_String;

public class SwapTwoStrings17 {

	public static void swapStrings(String[] str) {
		String temp = str[0];
		str[0] = str[1];
		str[1] = temp;
	}

	public static void main(String[] args) {
		String[] str = { "Hi", "Hellow" };

		System.out.println("Original Strings: " + str[0] + " and " + str[1]);
		swapStrings(str);
		System.out.println("Swapped Strings: " + str[0] + " and " + str[1]);
	}
}
