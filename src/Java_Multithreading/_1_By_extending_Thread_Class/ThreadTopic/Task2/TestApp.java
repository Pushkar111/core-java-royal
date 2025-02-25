package Java_Multithreading._1_By_extending_Thread_Class.ThreadTopic.Task2;

//Multiple Thread can Perform Multiple job

public class TestApp
{
	public static void main(String[] args)
	{
		Table resourse = new Table();

		MyThread1 t1 = new MyThread1(resourse);
		MyThread2 t2 = new MyThread2(resourse);
		MyThread3 t3 = new MyThread3(resourse);

		t1.setName("Table-5");
		t2.setName("Table-10");
		t3.setName("Table-15");

		t1.start();
		t2.start();
		t3.start();
	}
}
