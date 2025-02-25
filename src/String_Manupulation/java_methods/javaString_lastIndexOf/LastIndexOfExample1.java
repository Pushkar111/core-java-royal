package String_Manupulation.java_methods.javaString_lastIndexOf;

public class LastIndexOfExample1 {
	public static void main(String[] args) {
		String str = "This is java";

		int index1 = str.lastIndexOf("is");
		int index2 = str.lastIndexOf('s');

		System.out.println("index1: " + index1);
		System.out.println("index2: " + index2);
	}
}
