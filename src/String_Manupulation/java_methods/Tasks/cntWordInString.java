package String_Manupulation.java_methods.Tasks;

public class cntWordInString {
	public static void main(String[] args) {
		String str = "Royal Technosoft P Limited";
		int cnt = 1;

		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == ' ') {
				cnt++;
			}
		}
		System.out.println("TOTAL WORDS IN GIVEN STRING ARE: " + cnt);
	}
}
