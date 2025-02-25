package Java_IO.Data.UserDefineObjectsData.ByteOrientedWay.Serializable.With_transient;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

import Java_IO.Data.UserDefineObjectsData.ByteOrientedWay.Serializable.Student;

public class TestApp2_write {
	public static void main(String[] args) {

		Student s[] = new Student[5];

		for (int i = 0; i < s.length; i++) {
			s[i] = new Student();
			s[i].scanData();
		}

		try (FileOutputStream fout = new FileOutputStream(
				"C:\\Users\\pushk\\eclipse-workspace\\GEN_35_ROYAL\\src\\Java_IO\\Data\\UserDefineObjectsData\\ByteOrientedWay\\Serializable\\With_transient\\StudentArrayRecord.txt");
				ObjectOutputStream out = new ObjectOutputStream(fout);) {

			out.writeObject(s);
			System.out.println("Success");

		} catch (Exception e) {
			e.printStackTrace();
		}

	}
}
