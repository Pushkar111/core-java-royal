package oops;

public class StudentThis {

	int rno;
	String name;
	int std;
	String schoolName;
	int marks;

	public StudentThis() {

	}

	public StudentThis(int rno, String name, int std) {
		this();
		this.rno = rno;
		this.name = name;
		this.std = std;
	}

	public StudentThis(int rno, String name, int std, String schoolName) {
		this(rno, name, std);
		this.schoolName = schoolName;
	}

	public StudentThis(int rno, String name, int std, String schoolName, int marks) {
		this(rno, name, std, schoolName);
		this.marks = marks;
	}

	public void dispData() {
		System.out.println(this.rno + " " + this.name + " " + this.std + " " + this.schoolName + " " + this.marks);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StudentThis s1 = new StudentThis(1, "Rahul", 12, "DPS", 100);
		StudentThis s2 = new StudentThis(2, "Keyur", 11, "ABC");
		StudentThis s3 = new StudentThis(3, "Mayur", 10);

		s1.dispData();
		s2.dispData();
		s3.dispData();
	}

}
