package String_Manupulation.java_methods.javaString_substring;

public class SubstringExample2 {
	public static void main(String[] args) {
		String str = "This is Java";

		String substr1 = str.substring(0);// Starts with 0 and goes to end
		System.out.println(substr1);

		String substr2 = str.substring(5, 12);// Starts from 5 and goes to 10
		System.out.println(substr2);

		String substr3 = str.substring(5, 15); // Returns Exception
		System.out.println(substr3);

	}
}
