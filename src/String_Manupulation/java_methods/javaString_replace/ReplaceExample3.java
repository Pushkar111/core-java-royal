package String_Manupulation.java_methods.javaString_replace;

public class ReplaceExample3 {

	public static void main(String[] args) {
		String str = "oooooo-hhhh-oooooo";

		String ReplaceStr = str.replace("h", "s");
		System.out.println(ReplaceStr);

		ReplaceStr = ReplaceStr.replace("s", "h");
		System.out.println(ReplaceStr);

	}
}
