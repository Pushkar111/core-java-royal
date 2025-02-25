package Java_Collection._2_Java_ArrayList_Class;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class ArrayListExample5_Serialization_and_Deserialization
{
	public static void main(String[] args)
	{
		ArrayList<String> listObj = new ArrayList<String>();

		listObj.add("Rahul");
		listObj.add("Sagar");
		listObj.add("Kunal");
		listObj.add("Mehul");
		listObj.add("Ramesh");

		try (
				// Serialization
				FileOutputStream fout = new FileOutputStream(
						"C:\\Users\\pushk\\eclipse-workspace\\GEN_35_ROYAL\\src\\Java_Collection\\Java_ArrayList_Class_2\\ArrayListExample5_Serialization_and_Deserialization.txt");
				ObjectOutputStream out = new ObjectOutputStream(fout);

				// DeSerialization
				FileInputStream fin = new FileInputStream(
						"C:\\Users\\pushk\\eclipse-workspace\\GEN_35_ROYAL\\src\\Java_Collection\\Java_ArrayList_Class_2\\ArrayListExample5_Serialization_and_Deserialization.txt");
				ObjectInputStream oin = new ObjectInputStream(fin);)
		{
			out.writeObject(listObj);

			ArrayList<String> list = (ArrayList<String>) oin.readObject();
			System.out.println(list);

		} catch (Exception e)
		{
			e.printStackTrace();
		}
	}
}
