package String_Manupulation.java_methods.javaString_replaceAll;

public class ReplaceAllExample2 {

	public static void main(String[] args) {

		String s1 = "My name is Khan. My name is Bob. My name is Sonoo.";
		String replaceString = s1.replaceAll("is", "was");// replaces all occurrences of "is" to "was"
		System.out.println(replaceString);
	}
}