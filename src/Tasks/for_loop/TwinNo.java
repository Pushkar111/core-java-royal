package Tasks.for_loop;

import java.util.Scanner;

public class TwinNo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int no, dup, sum = 0, mult = 1, temp, i = 0;

		Scanner sc = new Scanner(System.in);

		System.out.print("Enter No : ");
		no = sc.nextInt();

		dup = no;

		for (; dup > 0;) {
			temp = dup % 10;
			sum += temp;
			mult *= temp;
			dup /= 10;
		}

		if (sum == mult) {
			System.out.println(no + " is Twin");
		} else {
			System.out.println(no + " is not Twin");
		}

	}

}
