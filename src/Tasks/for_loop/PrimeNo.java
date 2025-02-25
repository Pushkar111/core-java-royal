package Tasks.for_loop;

import java.util.Scanner;

public class PrimeNo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int no;
		int flag = 1;

		Scanner sc = new Scanner(System.in);

		System.out.print("Enter No : ");
		no = sc.nextInt();

		for (int i = 2; i < no; i++) {
			if (no % i == 0) {
				flag = 0;
				break;
			}
		}

		if (flag == 1) {
			System.out.println(no + " is Prime");
		} else {
			System.out.println(no + " is not Prime");
		}

	}

}
