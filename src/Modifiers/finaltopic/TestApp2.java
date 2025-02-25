package Modifiers.finaltopic;

public class TestApp2 {

	// 3 Ways to initialize variable

	// (1) Local Variable
	final int no1;

	// (2) Trough Constructor
	public TestApp2() {
		no1 = 100;
	}

	// (3) Through Constructor with Parameter
	public TestApp2(int no1) {
		this.no1 = no1;
	}

	public static void main(String[] args) {
		TestApp2 obj = new TestApp2(200);

		System.out.println("obj.no1 = " + obj.no1);
	}

}
