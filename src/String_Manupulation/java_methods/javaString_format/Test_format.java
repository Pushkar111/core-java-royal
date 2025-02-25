package String_Manupulation.java_methods.javaString_format;

public class Test_format {
	public static void main(String[] args) {
		String stmt1 = String.format("No1 is %d", 10);
		String stmt2 = String.format("No1 is %f", 20.43f);

		System.out.println("stmt1 : " + stmt1);
		System.out.println("stmt2 : " + stmt2);
	}
}
