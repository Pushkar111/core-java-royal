package Tasks.for_loop;

import java.util.Scanner;

public class ArmStrongNo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		int no;
		int m, temp, n, dc, dup, reminder, sum;

		dc = n = dup = sum = m = 0;

		System.out.print("Enter the No : ");
		no = sc.nextInt();

		dup = no;

		// digit count
		for (; no > 0;) {
			dc++;
			no /= 10;
		}

		System.out.println("Digit Count Of Number : " + dc);

		no = dup;

		while (no > 0) {
			temp = no % 10;

			if (dc == 1) {
				m = temp;
			} else if (dc == 2) {
				m = (temp * temp);
			} else if (dc == 3) {
				m = (temp * temp * temp);
			} else if (dc == 4) {
				m = (temp * temp * temp * temp);
			} else if (dc == 5) {
				m = (temp * temp * temp * temp * temp);
			} else {
				break;
			}

			sum += m;
			no /= 10;
		}

		if (sum == dup) {
			System.out.println(dup + " is the Armstrong number");
		} else {
			System.out.println(dup + " is not the Armstrong number");
		}

	}

}
