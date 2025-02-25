package String_Manupulation.java_methods.javaString_intern;

public class Test_intern {
	public static void main(String args[]) {
		String s1 = "Royal";
		String s2 = "Royal";
		String s3 = new String("Royal");
		String s4 = new String("Royal").intern(); // Interview Question

		System.out.println(s1 == s2); // true
		System.out.println(s1 == s3); // false
		System.out.println(s1 == s4); // true
	}
}
