// Understanding problem without toString() method

package String_Manupulation.java_methods.javaString_toString;

public class Student {
	int rno;
	String name, city;

	Student(int rno, String name, String city) {
		this.rno = rno;
		this.name = name;
		this.city = city;
	}

	public static void main(String[] args) {
		Student s1 = new Student(101, "Raj", "Ahemdabad");
		Student s2 = new Student(102, "Mohit", "Surat");

		System.out.println(s1);
		System.out.println(s2);
	}
}
