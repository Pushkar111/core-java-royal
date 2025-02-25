package String_Manupulation.java_methods.javaString_getChars;

public class StringGetCharsExample1 {
	public static void main(String[] args) {
		// 012345678901234567890123456789
		String str = new String("hello javaTpoint how r u");
		char[] chArr = new char[10];

		try {
			str.getChars(6, 16, chArr, 0);
			System.out.println(chArr);
		} catch (Exception e) {
			System.out.println(e);
		}

		for (char c : chArr) {
			System.out.println(c);
		}
	}
}
