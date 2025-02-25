package Java_Multithreading._1_By_extending_Thread_Class.ThreadTopic.Task3_Prime_Palindrome_Armstrong;

public class Operation
{
	public Boolean isPrime(int no)
	{
		if (no <= 1)
		{
			return false;
		}
		for (int i = 2; i <= Math.sqrt(no); i++)
		{
			if (no % i == 0)
			{
				return false;
			}
		}
		return true;
	}

	public Boolean isPalindrome(int no)
	{
		int rev = 0, temp;
		int dup = no;

		while (no > 0)
		{
			temp = no % 10;
			rev = (rev * 10) + temp;
			no = no / 10;
		}

		return dup == rev;
	}

	public Boolean isArmstrong(int no)
	{
		double sum = 0;
		int temp;
		int dup = no;

		while (no > 0)
		{
			temp = no % 10;
			sum = sum + Math.pow(temp, 3);
			no = no / 10;
		}
		return dup == sum;
	}
}
