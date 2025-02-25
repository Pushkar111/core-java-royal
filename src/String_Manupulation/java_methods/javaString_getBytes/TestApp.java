package String_Manupulation.java_methods.javaString_getBytes;

public class TestApp {
	public static void main(String[] args) {
		String value1 = "abcdefgh";

//		String to bytes Value(ASCII Value) -- getBytes();

//		it is used where String data write in file

		byte b[] = value1.getBytes();

		for (int i = 0; i < b.length; i++) {
			System.out.println(value1.charAt(i) + " → " + b[i]);
		}

	}
}
