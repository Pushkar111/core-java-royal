package Java_IO.Data.StringData.CharacterOrientedWay;

import java.io.FileWriter;

// StringData --> CharacterOrientedWay --> Write --> FileWriter

public class TestApp1_write
{
	public static void main(String[] args)
	{
		String name = "This is an example of writing to a file using FileWriter.";

		String filePath = "C:\\Users\\pushk\\eclipse-workspace\\GEN_35_ROYAL\\src\\Java_IO\\Data\\StringData\\CharacterOrientedWay\\example.txt";

		try
		{
			// File Connection Open
			FileWriter fw = new FileWriter(filePath);
			fw.write(name);
			// File Connection close
			fw.close();
			System.out.println("File written successfully.");
		} catch (Exception e)
		{
			e.printStackTrace();
		}
	}
}
