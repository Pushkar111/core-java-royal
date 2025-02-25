package Java_Inner_Class.not_static_inner_class.Anonymous_inner_class_2;

public abstract class Animal {

	public static void main(String[] args) {

		A obj = new A() {

			@Override
			public void test1() {
//				A :: Test1 ---> Java_Inner_Class.not_static_inner_class.Anonymous_inner_class_2.Animal$1@48140564
//  jis class ka object banega us class ke name ke piche $1 output aayega.
				System.out.println("A :: Test1 ---> " + this);
			}
		};
		obj.test1();
	}

}
