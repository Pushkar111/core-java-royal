// 19) How to Check if the String Contains Only Letters

package String_Manupulation.java_methods.RahulSir_Tasks_String;

public class StringContainOnlyLetters19 {

	public static boolean isCharOnly(String str) {
		for (int i = 0; i < str.length(); i++) {
			if (!Character.isJavaLetter(str.charAt(i))) {
				return false;
			}
		}
		return true;
	}

	public static void main(String[] args) {
		String str1 = "asdfghj";
		String str2 = "12345";
		String str3 = "1234asdfg";

		System.out.println(str1 + " contains only characters: " + isCharOnly(str1));
		System.out.println(str2 + " contains only characters: " + isCharOnly(str2));
		System.out.println(str3 + " contains only characters: " + isCharOnly(str3));

	}
}
