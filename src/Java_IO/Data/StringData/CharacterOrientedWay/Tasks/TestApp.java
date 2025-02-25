// program that reads bytes from one file and writes them to another file:
// Read data from old file ( Example.txt ) and write in new duplicate file.

package Java_IO.Data.StringData.CharacterOrientedWay.Tasks;

import java.io.FileReader;
import java.io.FileWriter;

public class TestApp {
	public static void main(String[] args) {

		try {
			FileReader fr = new FileReader(
					"C:\\Users\\pushk\\eclipse-workspace\\GEN_35_ROYAL\\src\\Java_IO\\Data\\StringData\\CharacterOrientedWay\\TestApp1_read.java");
			FileWriter fw = new FileWriter(
					"C:\\Users\\pushk\\eclipse-workspace\\GEN_35_ROYAL\\src\\Java_IO\\Data\\StringData\\CharacterOrientedWay\\Tasks\\DupTestApp1_read.java");

			int temp;

			while ((temp = fr.read()) != -1) {

				System.out.print((char) temp);
				fw.write(temp);

			}
			fw.close();
			fr.close();
			System.out.println("Success");

		} catch (Exception e) {
			e.printStackTrace();
		}

	}
}
