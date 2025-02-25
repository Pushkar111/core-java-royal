package Java_Multithreading._1_By_extending_Thread_Class.ThreadTopic.Task1;

public class Table
{
	public void printTable(int no)
	{
		for (int i = 0; i <= 10; i++)
		{
			try
			{
				Thread.sleep(500);
			} catch (InterruptedException e)
			{
				e.printStackTrace();
			}
			System.out.println(no + " * " + i + " = " + (no * i) + " ===> " + Thread.currentThread().getName());
		}
	}
}
