
/*
  Type Pramotion Rule :-
  ------------------
  boolean ---- true/false ---- X
  
	 				byte
	 				 |	
	 				short
	  			 	 |
 	char['A'] ---> 	int [65]
		   			 |
		   			long
		   			 |
		   			float
		   			 |
		   			double
 

Compile Time Polymorphism ---> oveloading
							1) By changing number of Arguments 
							1) By changing the data type 


 */

package oops.Polymorphism.oveloading;

public class Compile_time
{

	void add()
	{
		System.out.println("add()");
	}

	void add(int no1, int no2)
	{
		System.out.println("add(int no1, int no2)");
		System.out.println(no1 + " " + no2);
	}

	void add(double no1, double no2)
	{
		System.out.println("add(double no1, double no2 )");
		System.out.println(no1 + " " + no2);
	}

	void add(double no1, double no2, int no3, int no4)
	{
		System.out.println("add(double no1, double no2 , int no3 , int no4)");
		System.out.println(no1 + " " + no2 + " " + no3 + " " + no4);
	}

	public static void main(String[] args)
	{
		Compile_time obj = new Compile_time();

		obj.add();

		obj.add(10, 10);
		obj.add(100, 'A');

		obj.add(10000.0, 1000000.12);

		obj.add(100000.0, 100000.0, 21, 12);

	}

}
