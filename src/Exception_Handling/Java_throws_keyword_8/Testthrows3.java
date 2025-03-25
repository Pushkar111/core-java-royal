package Exception_Handling.Java_throws_keyword_8;

import java.io.IOException;

class M
{
	void method() throws IOException
	{
		System.out.println("device operation performed");
	}
}

public class Testthrows3
{
	public static void main(String args[]) throws IOException
	{// declare exception
		M m = new M();
		m.method();

		System.out.println("normal flow...");
	}

}
