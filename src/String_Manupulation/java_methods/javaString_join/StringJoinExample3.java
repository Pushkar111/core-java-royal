package String_Manupulation.java_methods.javaString_join;

public class StringJoinExample3 {
	public static void main(String[] args) {
		String str = null;

		/*
		 * In the case of using null as a delimiter, we get the null pointer exception.
		 * The following example confirms the same.
		 */

		str = String.join(null, "abc", "bcd", "apple");
		System.out.println(str);
	}
}
