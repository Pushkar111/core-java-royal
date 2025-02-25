package String_Manupulation.java_methods.javaString_toString;

public class Student_toString {
	int rno;
	String name, city;

	Student_toString(int rno, String name, String city) {
		this.rno = rno;
		this.name = name;
		this.city = city;
	}

	public String toString() {
		return rno + " " + name + " " + city;
	}

	public static void main(String[] args) {
		Student_toString s1 = new Student_toString(101, "Raj", "Ahemdabad");
		Student_toString s2 = new Student_toString(102, "Mohit", "Surat");

		System.out.println(s1.toString());
		System.out.println(s2.toString());
	}
}
