package String_Manupulation.java_methods.javaString_indexOf;

public class cntSpecificWordInString {
	public static void main(String[] args) {
		String str = "Welcome to javaTpoint";

		int cnt = 0;
		int startFrom = 0;

		for (;;) {
			int index = str.indexOf('o', startFrom);

			if (index >= 0) {
				// match found. Hence, increment the count
				cnt = cnt + 1;

				// start looking after the searched index
				startFrom = index + 1;
			} else {
				// the value of index is - 1 here. Therefore, terminate the loop
				break;
			}

		}
		System.out.println("In the String: " + str);
		System.out.println("The 'o' character has come " + cnt + " times");
	}
}
