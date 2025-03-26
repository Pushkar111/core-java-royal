package Java_IO.Data.StringData.ByteOrientedWay;

import java.io.FileInputStream;

//StringData --> read --> FileInputStream

public class TestApp1_read
{

	public static void main(String[] args)
	{

		// Specify the file name and path
		String filePath = "C:\\Users\\pushk\\eclipse-workspace\\GEN_35_ROYAL\\src\\Java_IO\\Data\\StringData\\ByteOrientedWay\\example.txt";

		StringBuilder sb = new StringBuilder();
		// read --> String --> ByteOrientedWay
		try
		{
			// File Connection Open
			FileInputStream fin = new FileInputStream(filePath);

			int temp;
			while ((temp = fin.read()) != -1)
			{
//				System.out.println(temp + " --> " + (char) temp); // byte + character
//				System.out.print((char) temp);

				char value = (char) temp;
				sb.append(value);
			}

			// File Connection close
			fin.close();

			System.out.println("File read successfully.");
		} catch (Exception e)
		{
			e.printStackTrace();
		}

		System.out.println("Final String: " + sb);
	}
}
