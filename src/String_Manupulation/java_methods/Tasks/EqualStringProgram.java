package String_Manupulation.java_methods.Tasks;

public class EqualStringProgram {
	public static void main(String[] args) {
		String s1 = "Royal";
		String s2 = "Royal";

		if (s1.compareTo(s2) == 0) {
			System.out.println("Both Strings are same");
		} else {
			System.out.println("Both Strings are different");
		}
	}
}
