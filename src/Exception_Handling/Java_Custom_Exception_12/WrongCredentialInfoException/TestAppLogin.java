package Exception_Handling.Java_Custom_Exception_12.WrongCredentialInfoException;

import java.util.Scanner;

public class TestAppLogin
{
	private static final String Valid_UserName = "admin";
	private static final String Valid_PassWord = "admin";

	public static void login(String userName, String password) throws WrongCredentialInfoException
	{
		if (!Valid_UserName.equals(userName) || !Valid_PassWord.equals(password))
		{
			throw new WrongCredentialInfoException("Invalid username or password.");
		} else
		{
			System.out.println("Login Successful");
		}
	}

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter UserName : ");
		String userName = sc.nextLine();

		System.out.println("Enter Password : ");
		String password = sc.nextLine();

		try
		{
			login(userName, password);
		} catch (WrongCredentialInfoException e)
		{
			e.printStackTrace();
		}
	}
}
