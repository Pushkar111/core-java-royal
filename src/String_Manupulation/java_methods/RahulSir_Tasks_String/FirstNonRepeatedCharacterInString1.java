// 1) Java Program to Find the First Non-repeated Character in a String

package String_Manupulation.java_methods.RahulSir_Tasks_String;

public class FirstNonRepeatedCharacterInString1 {
	public static void main(String[] args) {
		// 1) WITHOUT USING COLLECTION
		String str = "AABCCDBE";

		for (int i = 0; i < str.length(); i++) {

			boolean flag = true;

			for (int j = 0; j < str.length(); j++) {
				// Condition of repeated char
				if (i != j && (str.charAt(i) == str.charAt(j))) {
					flag = false;
					break;
				}
			}

			if (flag) {
				System.out.println("First Non-Repeated Character In String: " + str.charAt(i));
				break;
			}
		}
	}
}

// FIND FIRST NON-REPEATED CHAR IN GIVEN STRING

// -> THIS IS POSSIBLE USING 2 WAYS

// 1) WITHOUT USING COLLECTION (HashMap)
// 2) WITH USING COLLECTION (HashMap) -- ❌