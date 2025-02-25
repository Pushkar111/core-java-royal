//23) Java String Program to Insert a string into another string

package String_Manupulation.java_methods.RahulSir_Tasks_String;

import java.util.Scanner;

public class InsertStringIntoAnotherString23 {

	public static String InsertString(String str1, String str2, int position) {
		String firstPart = str1.substring(0, position);
		String lastPart = str1.substring(position);

		return firstPart + str2 + lastPart;
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter String : ");
		String str1 = sc.nextLine();
		System.out.println("Enter String Which You Wants to Insert : ");
		String str2 = sc.nextLine();

		System.out.println("Enter Position to Insert String : ");
		int position = sc.nextInt();

		String result = InsertString(str1, str2, position);
		System.out.println(result);

	}
}
