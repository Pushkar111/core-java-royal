package Java_IO.Data.UserDefineObjectsData.ByteOrientedWay.Serializable.With_transient;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class TestApp1_write {
	public static void main(String[] args) {
		Student obj = new Student(1, "Rahul", 12);

		try (FileOutputStream fout = new FileOutputStream(
				"C:\\Users\\pushk\\eclipse-workspace\\GEN_35_ROYAL\\src\\Java_IO\\Data\\UserDefineObjectsData\\ByteOrientedWay\\Serializable\\With_transient\\StudentRecord.txt");
				ObjectOutputStream out = new ObjectOutputStream(fout);

		) {

			out.writeObject(obj);
			System.out.println("Success");
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
}
