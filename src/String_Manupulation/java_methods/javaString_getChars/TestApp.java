package String_Manupulation.java_methods.javaString_getChars;

public class TestApp {
	public static void main(String[] args) {
		String value1 = "This is java which is developed By James Gosling";

		// String -- char array

		char v[] = new char[10];

		value1.getChars(8, 18, v, 0);

		for (int i = 0; i < v.length; i++) {
			System.out.println(v[i]);
		}

	}
}
