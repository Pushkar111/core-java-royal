package Java_IO.Data.UserDefineObjectsData.ByteOrientedWay.Serializable.With_transient;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

import Java_IO.Data.UserDefineObjectsData.ByteOrientedWay.Serializable.Student;

public class TestApp2_read {
	public static void main(String[] args) {

		try (FileInputStream fin = new FileInputStream(
				"C:\\Users\\pushk\\eclipse-workspace\\GEN_35_ROYAL\\src\\Java_IO\\Data\\UserDefineObjectsData\\ByteOrientedWay\\Serializable\\With_transient\\StudentArrayRecord.txt");

				ObjectInputStream oin = new ObjectInputStream(fin);) {

			Student s[] = (Student[]) oin.readObject();

			for (int i = 0; i < s.length; i++) {
				s[i].dispData();
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
