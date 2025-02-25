//18) How to Check if the String Contains Only Digits

package String_Manupulation.java_methods.RahulSir_Tasks_String;

public class StringContainsOnlyDigits18 {

	public static boolean isDigitOnly(String str) {
		for (int i = 0; i < str.length(); i++) {
			if (!Character.isDigit(str.charAt(i))) {
				return false;
			}
		}
		return true;
	}

	public static void main(String[] args) {
		String str1 = "12345";
		String str2 = "123asdfg546";

		System.out.println(str1 + " contains only digits: " + isDigitOnly(str1));
		System.out.println(str2 + " contains only digits: " + isDigitOnly(str2));
	}
}
