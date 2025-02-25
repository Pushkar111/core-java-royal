package Java_Multithreading._1_By_extending_Thread_Class.ThreadTopic.Task2;

public class Table
{
	public void printTable(int no)
	{
		for (int i = 1; i <= 10; i++)
		{
			System.out.println(no + " * " + i + " = " + (no * i) + " ===> " + Thread.currentThread().getName());
			try
			{
				Thread.sleep(500);
			} catch (InterruptedException e)
			{
				e.printStackTrace();
			}
		}
	}
}
