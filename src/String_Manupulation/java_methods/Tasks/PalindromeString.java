package String_Manupulation.java_methods.Tasks;

public class PalindromeString {
	public static void main(String[] args) {
		String name = "madam";
		boolean flag = true;

		for (int i = 0, j = (name.length() - 1); i < args.length; i++, j--) {
			char a = name.charAt(i);
			char b = name.charAt(j);

			if (a != b) {
				flag = false;
				break;
			}
		}

		if (flag) {
			System.out.println("Given String " + name + " is Palindrome");
		} else {
			System.out.println("Given String " + name + " is not Palindrome");
		}
	}
}
