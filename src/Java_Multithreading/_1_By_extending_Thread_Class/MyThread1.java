package Java_Multithreading._1_By_extending_Thread_Class;

// 1 Job perform by 5 Different Thread Like 1 Professor can teach 5 different classes
public class MyThread1 extends Thread
{
	@Override
	public void run()
	{
		for (int i = 1; i <= 5; i++)
		{
			System.out.println("run() :: Hi i am Thread ==> " + Thread.currentThread().getName());
			try
			{
				Thread.sleep(500);
			} catch (InterruptedException e)
			{
				e.printStackTrace();
			}
		}
	}

	public static void main(String[] args)
	{
		MyThread1 obj1 = new MyThread1();
		MyThread1 obj2 = new MyThread1();
		MyThread1 obj3 = new MyThread1();
		MyThread1 obj4 = new MyThread1();
		MyThread1 obj5 = new MyThread1();

		obj1.run(); // main [Thread]

		obj1.start();
		obj2.start();
		obj3.start();
		obj4.start();
		obj5.start();
	}
}
