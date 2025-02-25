package Java_Multithreading._2_By_implementing_Runnable_interface;

public class MyThread1 implements Runnable
{
	@Override
	public void run()
	{
		System.out.println("" + Thread.currentThread().getName());
	}

	public static void main(String[] args)
	{
		MyThread1 obj1 = new MyThread1();
		MyThread1 obj2 = new MyThread1();
		MyThread1 obj3 = new MyThread1();
		MyThread1 obj4 = new MyThread1();
		MyThread1 obj5 = new MyThread1();

		Thread t1 = new Thread(obj1);
		Thread t2 = new Thread(obj2);
		Thread t3 = new Thread(obj3);
		Thread t4 = new Thread(obj4);
		Thread t5 = new Thread(obj5);

		t1.run();

		t1.start();
		t2.start();
		t3.start();
		t4.start();
		t5.start();
	}

}
