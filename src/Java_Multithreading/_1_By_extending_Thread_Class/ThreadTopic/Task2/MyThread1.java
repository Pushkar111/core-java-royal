package Java_Multithreading._1_By_extending_Thread_Class.ThreadTopic.Task2;

public class MyThread1 extends Thread
{
	Table t = null;

	public MyThread1(Table t)
	{
		this.t = t;
	}

	@Override
	public void run()
	{
		t.printTable(5);
	}
}
