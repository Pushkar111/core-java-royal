package String_Manupulation.java_methods.javaString_format;

public class Test_format3 {
	public static void main(String[] args) {
		String str1 = String.format("%d", 101);
		String str2 = String.format("|%10d|", 101);
		String str3 = String.format("|%-10d|", 101);
		String str4 = String.format("|% d|", 101);
		String str5 = String.format("|010%d|", 101);

		System.out.println(str1);
		System.out.println(str2);
		System.out.println(str3);
		System.out.println(str4);
		System.out.println(str5);
	}
}
