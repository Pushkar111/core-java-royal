package Java_Multithreading._1_By_extending_Thread_Class;

public class MyThread2 extends Thread
{
	@Override
	public void run()
	{
		for (int i = 1; i <= 5; i++)
		{
			System.out.println("run() :: Hi i am Thread ==> " + Thread.currentThread().getName() + " " + i);
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

		System.out.println("Thread.currentThread().getName() ==> " + Thread.currentThread().getName());

		MyThread2 obj1 = new MyThread2();
		MyThread2 obj2 = new MyThread2();
		MyThread2 obj3 = new MyThread2();
		MyThread2 obj4 = new MyThread2();
		MyThread2 obj5 = new MyThread2();

		obj1.run(); // main [Thread]

		System.out.println();

		try
		{
			obj1.join(1500);
		} catch (InterruptedException e)
		{
			e.printStackTrace();
		}

//		obj1.start();
		obj2.start();
		obj3.start();
		obj4.start();
		obj5.start();
	}
}
