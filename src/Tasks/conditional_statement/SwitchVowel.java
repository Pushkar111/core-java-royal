package Tasks.conditional_statement;

import java.util.Scanner;

public class SwitchVowel
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the Character : ");
		char ch = sc.next().charAt(0);

		char chUpper = Character.toUpperCase(ch);

		switch (chUpper)
		{
		case 'A':
		case 'E':
		case 'I':
		case 'O':
		case 'U':
			System.out.println(ch + " is Vowel");
			break;
		default:
			System.out.println(ch + " is Constant");
		}
	}
}
