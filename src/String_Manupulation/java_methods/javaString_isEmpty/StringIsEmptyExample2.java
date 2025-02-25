package String_Manupulation.java_methods.javaString_isEmpty;

public class StringIsEmptyExample2 {
	public static void main(String[] args) {
		String s1 = "";
		String s2 = "javaTpoint";

		// Either length is zero or isEmpty is true
		if (s1.length() == 0 || s1.isEmpty()) {
			System.out.println("String s1 is empty");
		} else {
			System.out.println("s1");
		}

		if (s2.length() == 0 || s2.isEmpty()) {
			System.out.println("String s2 is empty");
		} else {
			System.out.println(s2);
		}
	}
}
