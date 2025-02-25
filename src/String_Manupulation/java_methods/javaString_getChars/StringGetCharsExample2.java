package String_Manupulation.java_methods.javaString_getChars;

public class StringGetCharsExample2 {
	public static void main(String[] args) {
		// 012345678901234567890
		String str = new String("Welcome to javaTpoint");
		char[] chArr = new char[20];

		try {
			str.getChars(1, 26, chArr, 0);
			System.out.println(chArr);
		} catch (Exception e) {
			System.out.println(e);
		}
	}
}
