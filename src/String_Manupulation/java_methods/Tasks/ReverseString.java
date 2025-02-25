package String_Manupulation.java_methods.Tasks;

public class ReverseString {
	// by using while loop

	public static String reverse(String str) {
		String rev = "";
		int len = str.length();

		while (len > 0) {
			rev = rev + str.charAt(len - 1);
			len--;
		}
		return rev;
	}

	public static void main(String[] args) {
		String str = "java";
		String result = reverse(str);
		System.out.println(result);
	}

}
