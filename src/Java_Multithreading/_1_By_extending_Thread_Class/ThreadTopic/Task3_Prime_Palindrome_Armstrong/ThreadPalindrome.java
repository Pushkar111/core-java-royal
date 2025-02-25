package Java_Multithreading._1_By_extending_Thread_Class.ThreadTopic.Task3_Prime_Palindrome_Armstrong;

public class ThreadPalindrome extends Thread
{
	Operation o = null;
	private int no;
	private Boolean result;

	public ThreadPalindrome(int no, Operation o)
	{
		this.no = no;
		this.o = o;
	}

	@Override
	public void run()
	{
		result = o.isPalindrome(no);
	}

	public Boolean getResult()
	{
		return result;
	}
}
