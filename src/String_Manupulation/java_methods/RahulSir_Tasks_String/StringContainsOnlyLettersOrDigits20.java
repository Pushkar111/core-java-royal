package String_Manupulation.java_methods.RahulSir_Tasks_String;

public class StringContainsOnlyLettersOrDigits20 {

	public static boolean isDigitOrChar(String str) {
		for (int i = 0; i < str.length(); i++) {
			if (!Character.isLetterOrDigit(str.charAt(i))) {
				return false;
			}
		}
		return true;
	}

	public static void main(String[] args) {
		String str1 = "1234";
		String str2 = "sdfg";
		String str3 = "#1234sdfg";

		System.out.println(str1 + " contains only digits or Chars: " + isDigitOrChar(str1));
		System.out.println(str2 + " contains only digits or Chars: " + isDigitOrChar(str2));
		System.out.println(str3 + " contains only digits or Chars: " + isDigitOrChar(str3));

	}
}
