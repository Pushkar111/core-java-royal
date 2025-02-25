package String_Manupulation.java_methods.javaString_lastIndexOf;

public class LastIndexOfExample2 {
	public static void main(String[] args) {
//					  012345678901
		String str = "This is java";
		int index1 = str.lastIndexOf("is", 5);
		int index2 = str.lastIndexOf('s', 5);
		System.out.println("index1: " + index1);
		System.out.println("index2: " + index2);
	}
}
