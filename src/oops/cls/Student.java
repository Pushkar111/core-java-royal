package oops.cls;

import java.util.Scanner;

public class Student {

	int rno;
	String name;
	int std;

	public void scanData() {
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter Rno : ");
		rno = sc.nextInt();
		sc.nextLine();
		System.out.print("Enter Name : ");
		name = sc.nextLine();
		System.out.print("Enter Std : ");
		std = sc.nextInt();
	}

	public void dispData() {
		System.out.println(rno + " " + name + " " + std);
	}

	public static void main(String[] args) {
		// Student -> class
		// s -> Reference variable (intentiallty)
		// new -. keyword
		// Student() -> object of Student class (intentially)
		/*
		 * Student s1 = new Student(), s2 = new Student(), s3 = new Student(), s4 = new
		 * Student(), s5 = new Student();
		 * 
		 * s1.scanData(); s2.scanData(); s3.scanData(); s4.scanData(); s5.scanData();
		 * 
		 * s1.dispData(); s2.dispData(); s3.dispData(); s4.dispData(); s5.dispData();
		 */

		Student s[] = new Student[5];

		for (int i = 0; i < s.length; i++) {
			s[i] = new Student();
			s[i].scanData();
		}

		for (int i = 0; i < s.length; i++) {
			s[i].dispData();
			s[i] = null;
		}
	}

}
