package Java_Multithreading._1_By_extending_Thread_Class.ThreadTopic.Task3_Prime_Palindrome_Armstrong;

public class ThreadArmstrong extends Thread
{
	Operation o = null;
	private int no;
	private Boolean result;

	public ThreadArmstrong(int no, Operation o)
	{
		this.o = o;
		this.no = no;
	}

	@Override
	public void run()
	{
		result = o.isArmstrong(no);
	}

	public Boolean getResult()
	{
		return result;
	}
}
