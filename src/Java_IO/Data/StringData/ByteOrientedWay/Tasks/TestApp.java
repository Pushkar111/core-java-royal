// program that reads bytes from one file and writes them to another file:
// Read data from old file ( Example.txt ) and write in new duplicate file.

package Java_IO.Data.StringData.ByteOrientedWay.Tasks;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class TestApp {

	public static void main(String[] args) {
		try {
			FileInputStream fin = new FileInputStream(
					"C:\\Users\\pushk\\eclipse-workspace\\GEN_35_ROYAL\\src\\Java_IO\\Data\\StringData\\ByteOrientedWay\\TestApp1_read.java");
			FileOutputStream fout = new FileOutputStream(
					"C:\\Users\\pushk\\eclipse-workspace\\GEN_35_ROYAL\\src\\Java_IO\\Data\\StringData\\ByteOrientedWay\\Tasks\\DupTestApp1_read.java");

			int temp;

			while ((temp = fin.read()) != -1) {
				System.out.print((char) temp);
				fout.write(temp);
			}
			fin.close();
			fout.close();
			System.out.println("Success");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
