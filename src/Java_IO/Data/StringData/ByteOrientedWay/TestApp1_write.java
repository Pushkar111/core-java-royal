package Java_IO.Data.StringData.ByteOrientedWay;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

// StringData --> ByteOrientedWay --> Write --> FileOutputStream

public class TestApp1_write
{
	public static void main(String[] args)
	{

		String name = "This is an example of writing to a file using FileOutputStream.";

		// Specify the file name and path
		String filePath = "C:\\Users\\pushk\\eclipse-workspace\\GEN_35_ROYAL\\src\\Java_IO\\Data\\StringData\\ByteOrientedWay\\example.txt";

		// write --> String --> ByteOrientedWay
		try
		{
			// File Connection Open
			FileOutputStream fout = new FileOutputStream(filePath);

			byte b[] = name.getBytes();
			fout.write(b);

			// File Connection Close
			fout.close();

			System.out.println("File written successfully.");
		} catch (FileNotFoundException e)
		{
			e.printStackTrace();
		} catch (IOException e)
		{
			e.printStackTrace();
		}

	}
}
