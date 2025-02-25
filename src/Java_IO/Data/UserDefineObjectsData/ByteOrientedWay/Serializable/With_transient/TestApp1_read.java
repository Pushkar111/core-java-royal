package Java_IO.Data.UserDefineObjectsData.ByteOrientedWay.Serializable.With_transient;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class TestApp1_read {
	public static void main(String[] args) {

		try (FileInputStream fin = new FileInputStream(
				"C:\\Users\\pushk\\eclipse-workspace\\GEN_35_ROYAL\\src\\Java_IO\\Data\\UserDefineObjectsData\\ByteOrientedWay\\Serializable\\With_transient\\StudentRecord.txt");
				ObjectInputStream oin = new ObjectInputStream(fin);) {

			Student s = (Student) oin.readObject();
			System.out.println(s.getRno() + " " + s.getName() + " " + s.getStd());

		} catch (Exception e) {
			e.printStackTrace();
		}

	}
}
