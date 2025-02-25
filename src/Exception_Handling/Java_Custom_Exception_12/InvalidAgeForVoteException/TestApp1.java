package Exception_Handling.Java_Custom_Exception_12.InvalidAgeForVoteException;

import java.util.Scanner;

public class TestApp1
{
	// pass on / declare
	public static void isValidForVote(int age) throws InvalidAgeForVoteException
	{
		if (age < 18)
		{

			// raise custom-exception
			throw new InvalidAgeForVoteException("\n\t\"Invalid age,\n\t\tPlease Enter age above 18\"");

		} else
		{

			System.out.println("Welcome for Vote.");

		}
	}

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter Age : ");
		int age = sc.nextInt();

		try
		{

			isValidForVote(age);

		} catch (InvalidAgeForVoteException e)
		{

			e.printStackTrace();

		}

		System.out.println("Main method---line no----31");
	}
}
