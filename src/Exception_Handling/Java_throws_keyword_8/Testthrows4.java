package Exception_Handling.Java_throws_keyword_8;

import java.io.IOException;

class M {
	void method() throws IOException {
		throw new IOException("device error");
	}
}

public class Testthrows4 {
	public static void main(String args[]) throws IOException {// declare exception
		M m = new M();
		m.method();

		System.out.println("normal flow...");
	}
}
