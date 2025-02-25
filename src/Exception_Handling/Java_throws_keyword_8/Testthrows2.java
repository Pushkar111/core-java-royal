package Exception_Handling.Java_throws_keyword_8;

import java.io.IOException;

public class Testthrows2 {

	public static class M {
		void method() throws IOException {
			throw new IOException("device error");
		}
	}

	public static void main(String args[]) {
		try {
			M m = new M();
			m.method();
		} catch (Exception e) {
			System.out.println("exception handled");
		}

		System.out.println("normal flow...");
	}
}
