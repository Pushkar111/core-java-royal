//28) Java String Program to  Add Characters to a String

package String_Manupulation.java_methods.RahulSir_Tasks_String;

public class AddCharactersToString28 {

	public static void main(String[] args) {

		String oringinalStr = "Hello";

		String charAdd = "!";
		String newString = oringinalStr + charAdd;

		System.out.println("Original String: " + oringinalStr);
		System.out.println("Character to Add: " + charAdd);
		System.out.println("New String: " + newString);

		String newMoreAdd = ", World";
		String finalString = newString + newMoreAdd;

		System.out.println("\nFinal String: " + finalString);

	}
}
