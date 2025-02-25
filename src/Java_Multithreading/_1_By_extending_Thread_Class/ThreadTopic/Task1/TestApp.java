package Java_Multithreading._1_By_extending_Thread_Class.ThreadTopic.Task1;

// Multiple Thread can Perform Single job

public class TestApp
{
	public static void main(String[] args)
	{
		Table resourse = new Table();

		MyThread t1 = new MyThread(resourse);
		MyThread t2 = new MyThread(resourse);
		MyThread t3 = new MyThread(resourse);
		MyThread t4 = new MyThread(resourse);
		MyThread t5 = new MyThread(resourse);

		t1.start();
		t2.start();
		t3.start();
		t4.start();
		t5.start();
	}
}
