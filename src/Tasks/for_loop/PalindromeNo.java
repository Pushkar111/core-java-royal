package Tasks.for_loop;

import java.util.Scanner;

public class PalindromeNo
{

	public static void main(String[] args)
	{
		int no, temp, rev = 0, dup;

		Scanner sc = new Scanner(System.in);

		System.out.print("Enter No : ");
		no = sc.nextInt();

		dup = no;
		for (; dup > 0;)
		{
			temp = dup % 10;
			rev = (rev * 10) + temp;
			dup /= 10;
		}

		if (no == rev)
		{
			System.out.println(no + " is Palindrome");
		} else
		{
			System.out.println(no + " is not Palindrome");
		}

	}

}
