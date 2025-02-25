package Java_Multithreading._1_By_extending_Thread_Class.ThreadTopic.Task1;

public class MyThread extends Thread
{
	Table t = null;

	public MyThread(Table t)
	{
		this.t = t;
	}
	
	@Override
	public void run()
	{
		t.printTable(5);
	}
}
