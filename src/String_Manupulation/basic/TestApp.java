package String_Manupulation.basic;

import java.util.Scanner;

public class TestApp
{
	public static void main(String[] args) throws Exception
	{
		// 2 ways of Scan Character
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the name : ");
		char ch1 = (char) System.in.read();
		System.out.println(ch1);

		System.out.println("Enter the name : ");
		char ch2 = sc.next().charAt(0);
		System.out.println(ch2);
	}
}
