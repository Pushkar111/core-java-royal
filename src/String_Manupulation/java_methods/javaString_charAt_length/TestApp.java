package String_Manupulation.java_methods.javaString_charAt_length;

public class TestApp {

	public static void main(String[] args) {

		int a[] = new int[5];
		System.out.println("a.length -- Operator -- array Size :: + " + a.length);

		String name = "Royal Technosoft P Limited!";
		System.out.println("name.length() -- method in String class :: " + name.length());

		System.out.println(name.charAt(0));
		System.out.println(name.charAt(1));
		System.out.println(name.charAt(2));
		System.out.println(name.charAt(3));
		System.out.println(name.charAt(4));

		System.out.println();

		for (int i = 0; i < name.length(); i++) {
			System.out.print(name.charAt(i));
		}

	}
}
