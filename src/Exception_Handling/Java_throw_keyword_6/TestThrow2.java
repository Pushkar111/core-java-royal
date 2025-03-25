package Exception_Handling.Java_throw_keyword_6;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class TestThrow2
{
	public static void method() throws FileNotFoundException
	{
		FileReader file = new FileReader("C:\\Users\\pushk\\eclipse-workspace\\GEN_35_ROYAL\\src\\Exception_Handling\\Java_throw_keyword_6\\TestThrow2.txt");
		BufferedReader fileInput = new BufferedReader(file);

		throw new FileNotFoundException();
	}

	public static void main(String[] args)
	{
		try
		{
			method();
		} catch (FileNotFoundException e)
		{
			e.printStackTrace();
		}

		System.out.println("Rest of code...");
	}
}
