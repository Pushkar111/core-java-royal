//3) Java Program to Find Duplicate Characters in a String

package String_Manupulation.java_methods.RahulSir_Tasks_String;

public class FindDuplicateCharactersInString3 {
	public static void main(String[] args) {
		String str = "java";
		char[] ch = str.toCharArray();
		int count = 0;

		for (int i = 0; i < ch.length; i++) {
			for (int j = i + 1; j < ch.length; j++) {
				if (ch[i] == ch[j]) {
					System.out.println("Duplicate Elements: " + ch[j]);
					count++;
				}
			}
		}
		System.out.println("Count of Duplicate Elements: " + count);
	}
}
