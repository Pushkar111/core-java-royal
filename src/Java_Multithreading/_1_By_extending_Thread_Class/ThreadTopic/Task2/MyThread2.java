package Java_Multithreading._1_By_extending_Thread_Class.ThreadTopic.Task2;

public class MyThread2 extends Thread
{
	Table t = null;

	public MyThread2(Table t)
	{
		this.t = t;
	}

	@Override
	public void run()
	{
		t.printTable(10);
	}
}
