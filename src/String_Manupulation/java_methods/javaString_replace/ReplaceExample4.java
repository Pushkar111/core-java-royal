package String_Manupulation.java_methods.javaString_replace;

/*
 * The replace() method throws the NullPointerException when the replacement or target is null. 
 * The following example confirms the same
 * */

public class ReplaceExample4 {

	public static void main(String[] args) {
		String str = "This is Java Which is Developed By James Gosling.";
		int size = str.length();

		System.out.println(str);
		String target = null;

		// replacing null with JavaTpoint. Hence, the NullPointerException is raised.
		str = str.replace(target, "Java ");

		System.out.println(str);

	}
}
