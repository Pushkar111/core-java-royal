package Exception_Handling.Java_throws_keyword_8;

import java.io.IOException;

class X
{
	void method() throws IOException
	{
		throw new IOException("device error");
	}
}

public class Testthrows4
{
	public static void main(String args[]) throws IOException
	{// declare exception
		X obj = new X();
		obj.method();

		System.out.println("normal flow...");
	}
}
