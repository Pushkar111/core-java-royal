package String_Manupulation.java_methods.Tasks;

public class cntVowelsInString {
	public static void main(String[] args) {
		String str = "Hi This is String Program";
		char[] vwArr = new char[] { 'a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U' };
		int cnt = 0;

		for (int i = 0; i < str.length(); i++) {
			for (int j = 0; j < vwArr.length; j++) {

				if (str.charAt(i) == vwArr[j]) {
					cnt = cnt + 1;
				}
			}
		}

		System.out.println("No of Vowels in Given String : " + cnt);

	}
}
