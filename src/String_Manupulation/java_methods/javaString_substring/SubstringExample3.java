package String_Manupulation.java_methods.javaString_substring;

public class SubstringExample3 {
	public static void main(String[] args) {

		String[] str = { "Praveen Kumar", "Yuvraj Singh", "Harbhajan Singh", "Gurjit Singh", "Virat Kohli",
				"Rohit Sharma", "Sandeep Singh", "Milkha Singh" };

		String surName = "Singh";
		int surNameSize = surName.length();

		for (int i = 0; i < str.length; i++) {
			int len = str[i].length();

			// extracting the surName
			String substr = str[i].substring(len - surNameSize);

			// checks whether the surname is equal to "Singh" or not
			if (substr.equals(surName)) {
				System.out.println(str[i]);
			}

		}
	}
}
