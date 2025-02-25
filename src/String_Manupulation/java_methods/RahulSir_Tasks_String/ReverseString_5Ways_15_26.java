//15) Java Program to Reverse a String(5 ways)
//26) Java String Program to Reverse a String

package String_Manupulation.java_methods.RahulSir_Tasks_String;

public class ReverseString_5Ways_15_26 {

	// Method 1: Using a for loop
	public static void ReverseString1(String str) {

		String revStr = "";

		for (int i = str.length() - 1; i >= 0; i--) {
			revStr += str.charAt(i);
		}

		System.out.println("Reverse String of " + str + " is " + revStr);
	}

	// Method 2: Using a Character Array
	public static void ReverseString2(String str) {

		char[] charArr = str.toCharArray();
		String revStr = "";

		for (int i = charArr.length - 1; i >= 0; i--) {
			revStr += str.charAt(i);
		}

		System.out.println("Reverse String of " + str + " is " + revStr);
	}

	// Method 3: Using Recursion
	public static String ReverseString3(String str) {
		if (str.isEmpty()) {
			return str;
		}
		return ReverseString3(str.substring(1)) + str.charAt(0);
	}

	// Method 4: Using Two Pointers (swapping)
	public static void ReverseString4(String str) {

		char[] charArr = str.toCharArray();
		int left = 0;
		int right = charArr.length - 1;

		while (left < right) {
			char temp = charArr[left];
			charArr[left] = charArr[right];
			charArr[right] = temp;

			left++;
			right--;
		}

		String revStr = new String(charArr);
		System.out.println("Reverse String of " + str + " is " + revStr);
	}

	// Method 5: Using a StringBuilder
	public static void ReverseString5(String str) {
		StringBuilder sb = new StringBuilder(str);
		String revStr = sb.reverse().toString();

		System.out.println("Reverse String of " + str + " is " + revStr);
	}

	public static void main(String[] args) {
		String str = "Hello World";
		ReverseString1(str);

		ReverseString2(str);

		String result = ReverseString3(str);
		System.out.println("Reverse String of " + str + " is " + result);

		ReverseString4(str);

		ReverseString5(str);

	}
}
