package Java_Multithreading._1_By_extending_Thread_Class.ThreadTopic.Task3_Prime_Palindrome_Armstrong;

import java.util.Scanner;

public class TestApp
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter No : ");
		int no = sc.nextInt();

		Operation resourse = new Operation();

		ThreadPrime tp1 = new ThreadPrime(no, resourse);
		ThreadPalindrome tp2 = new ThreadPalindrome(no, resourse);
		ThreadArmstrong tp3 = new ThreadArmstrong(no, resourse);

		tp1.start();
		tp2.start();
		tp3.start();

		try
		{
			tp1.join();
			tp2.join();
			tp3.join();
		} catch (Exception e)
		{
			e.printStackTrace();
		}

		boolean isPrime = tp1.getResult();
		boolean isPalindrome = tp2.getResult();
		boolean isArmstrong = tp3.getResult();

		if (isPrime == Boolean.TRUE)
		{
			System.out.println("isPrime :: " + isPrime);
		}
		if (isPalindrome == Boolean.TRUE)
		{
			System.out.println("isPalindrome :: " + isPalindrome);
		}
		if (isArmstrong == Boolean.TRUE)
		{
			System.out.println("isArmstrong :: " + isArmstrong);
		}

	}
}
