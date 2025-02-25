package Java_Inner_Class.not_static_inner_class.Anonymous_inner_class_2;

public class Bombay {
	public static void main(String[] args) {
		B obj = new B() {

			@Override
			public void test1() {

				System.out.println("B :: test1() --> " + this);

			}
		};

		obj.test1();
	}
}
