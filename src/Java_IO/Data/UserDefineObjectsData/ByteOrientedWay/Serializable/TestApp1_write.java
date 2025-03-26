package Java_IO.Data.UserDefineObjectsData.ByteOrientedWay.Serializable;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

//StringData --> ByteOrientedWay --> Write --> FileOutputStream
public class TestApp1_write
{
	public static void main(String[] args)
	{
		Student obj = new Student(1, "Rahul", 12);

		// Data --obj ---write---file
		// Autoclosable Resource--[try..catch]

		try (FileOutputStream fout = new FileOutputStream(
				"C:\\Users\\pushk\\eclipse-workspace\\GEN_35_ROYAL\\src\\Java_IO\\Data\\UserDefineObjectsData\\ByteOrientedWay\\Serializable\\StudentRecord.txt");
				ObjectOutputStream out = new ObjectOutputStream(fout);)
		{
			out.writeObject(obj); // JVM -->

			System.out.println("success");
		} catch (FileNotFoundException e)
		{
			e.printStackTrace();
		} catch (IOException e)
		{
			e.printStackTrace();
		}

	}
}
