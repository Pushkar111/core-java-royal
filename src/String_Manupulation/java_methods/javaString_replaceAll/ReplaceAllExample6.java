package String_Manupulation.java_methods.javaString_replaceAll;

/*
 * Even the null regular expression is also not accepted by the replaceAll() method as the NullPointerException is raised.
 * 
 * */

public class ReplaceAllExample6 {

	public static void main(String[] args) {
		String str = "Royal Technosoft P Limited";
		System.out.println(str);

		String regex = null;
		// adding a white space before and after every character of the input string.
		str = str.replaceAll(regex, " ");

		System.out.println(str);
	}
}
