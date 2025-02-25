package String_Manupulation.java_methods.javaString_replaceAll;

/*
 * 	The replaceAll() method throws the PatternSyntaxException 
 *  when there is an improper regular expression. 
 *  Look at the following example.

 * */

public class ReplaceAllExample4 {
	public static void main(String[] args) {
		String str = "For learning Java, JavaTpoint is a very good site.";

		System.out.println(str);

		String regex = "\\"; // the regular expression is not valid.

		// invoking the replaceAll() method raises the PatternSyntaxException
		str = str.replaceAll(regex, "JavaTpoint ");

		System.out.println(str);
	}
}
