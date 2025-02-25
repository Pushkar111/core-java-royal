
/*
 * boolean -- X
 * 
 * 				byte
 * 				 |	
 * 				short
 *  			 |
 *	char ---> 	int
 *  			 |
 *  			long
 *  			 |
 *  			float
 *  			 |
 *  			double
 *  
 * 
 * 
 */

package oops.Polymorphism.oveloading;

public class Compile_time {

	void addfun() {
		System.out.println("addfun()");
	}

	void addfun(int no1, int no2) {
		System.out.println("add(int no1, int no2)");
		System.out.println(no1 + " " + no2);

	}

	void addfun(double no1, double no2) {
		System.out.println("add(double no1, double no2 )");

		System.out.println(no1 + " " + no2);
	}

	void addfun(double no1, double no2, int no3, int no4) {
		System.out.println("add(int no1, int no2 , int no3 , int no4)");
		System.out.println(no1 + " " + no2 + " " + no3 + " " + no4);
	}

	public static void main(String[] args) {
		Compile_time obj = new Compile_time();

		obj.addfun(100, 'a');
	}

}
