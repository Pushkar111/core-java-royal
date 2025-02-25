package String_Manupulation.java_methods.javaString_replaceAll;

public class ReplaceAllExample5 {

	public static void main(String[] args) {
		String str = "Royal Technosoft P Limited";
		System.out.println(str);

		String regex = "";
		// adding a white space before and after every character of the input string.
		str = str.replaceAll(regex, " ");

		System.out.println(str);
	}
}
