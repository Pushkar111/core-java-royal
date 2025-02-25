//2) Java Program to Check Palindrome String
//24) Java String program to check whether a string is a Palindrome

package String_Manupulation.java_methods.RahulSir_Tasks_String;

public class PalindromeString2_24 {
	public static void main(String[] args) {
		String name = "madam";
		boolean flag = true;

		for (int i = 0, j = (name.length() - 1); i < args.length; i++, j--) {
			if (name.charAt(i) != name.charAt(j)) {
				flag = false;
				break;
			}
		}

		if (flag) {
			System.out.println("Given String " + name + " is Palindrome");
		} else {
			System.out.println("Given String " + name + " is not Palindrome");
		}
	}
}
