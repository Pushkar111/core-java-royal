package Java_Multithreading._1_By_extending_Thread_Class.DaemonThreadTopic;

public class DeamonThread extends Thread
{
	@Override
	public void run()
	{
		if (Thread.currentThread().isDaemon())
		{
			System.out.println("Hi i am Deamon Thread ==> " + Thread.currentThread().getName());
		} else
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
	}

	public static void main(String[] args)
	{

		DeamonThread t1 = new DeamonThread();
		DeamonThread t2 = new DeamonThread();
		DeamonThread t3 = new DeamonThread();

		t1.setDaemon(true);

		t1.setName("C Langauge");
		t2.setName("C++ Langauge");
		t3.setName("Java Langauge");

		t1.start();
		t2.start();
		t3.start();

		t1.setPriority(MIN_PRIORITY); // 1
		t2.setPriority(NORM_PRIORITY); // 5
		t3.setPriority(MAX_PRIORITY); // 10

	}
}
