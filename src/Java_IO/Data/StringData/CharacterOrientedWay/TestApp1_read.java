package Java_IO.Data.StringData.CharacterOrientedWay;

import java.io.FileReader;

//StringData --> CharacterOrientedWay --> read --> FileReader

public class TestApp1_read {
	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder();

		// Specify the file name and path
		String filePath = "C:\\Users\\pushk\\eclipse-workspace\\GEN_35_ROYAL\\src\\Java_IO\\Data\\StringData\\CharacterOrientedWay\\example.txt";

		try {
			// File Connection Open
			FileReader fr = new FileReader(filePath);

			int temp;
			while ((temp = fr.read()) != -1) {
//				System.out.println(temp + " --> " + (char) temp); // byte + character
//				System.out.print((char) temp);
				char value = (char) temp;
				sb.append(value);
			}

			// File Connection Close
			fr.close();

			System.out.println("File read successfully.");

		} catch (Exception e) {
			e.printStackTrace();
		}

		System.out.println("Final String: " + sb);
	}
}
