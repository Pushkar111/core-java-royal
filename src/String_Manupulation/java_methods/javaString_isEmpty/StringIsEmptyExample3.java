package String_Manupulation.java_methods.javaString_isEmpty;

public class StringIsEmptyExample3 {
	public static void main(String[] args) {
		String str = null;

//		not work isEmpty() in null string
		/*
		 * if (str.isEmpty()) { System.out.println("The String is null"); } else {
		 * System.out.println("The String is not null"); }
		 */

//		Here, we can use the == operator to check for the null strings.
		if (str == null) {
			System.out.println("The string is null.");
		} else {
			System.out.println("The string is not null.");
		}

	}
}
