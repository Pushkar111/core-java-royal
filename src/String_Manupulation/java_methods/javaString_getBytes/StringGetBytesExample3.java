package String_Manupulation.java_methods.javaString_getBytes;

import java.io.UnsupportedEncodingException;

public class StringGetBytesExample3 {

	public static void main(String[] args) {
		// Given String
		String str = "Welcome to Royal Technosoft P Limited !!";
		System.out.println("The String is ==> " + str);

		// inside try block encoding is
		// being done using different charsets
		try {
			// 16 - bit UCS Transformation format
			byte[] byteArr = str.getBytes("UTF-16");
			System.out.println("\nAfter converted into UTF-16 the String is : ");

			for (int j = 0; j < byteArr.length; j++) {
				System.out.print(byteArr[j] + " ");
			}

			System.out.println("\n");

			// Big Indian byte order, 16 - bit UCS Transformation format
			byte[] byteArr1 = str.getBytes("UTF-16BE");
			System.out.println("After converted into UTF-16BE the String is : ");

			for (int j = 0; j < byteArr1.length; j++) {
				System.out.print(byteArr1[j] + " ");
			}

			System.out.println("\n");

			// ISO Latin Alphabet
			byte[] byteArr2 = str.getBytes("ISO-8859-1");
			System.out.println("After converted into ISO-8859-1 the String is : ");

			for (int j = 0; j < byteArr2.length; j++) {
				System.out.print(byteArr2[j] + " ");
			}

			System.out.println("\n");

			// Little Indian byte order, 16 - bit UCS Transformation format
			byte[] byteArr3 = str.getBytes("UTF-16LE");
			System.out.println("After converted into UTF-16LE the String is : ");

			for (int j = 0; j < byteArr3.length; j++) {
				System.out.print(byteArr3[j] + " ");
			}

		} catch (UnsupportedEncodingException g) {
			System.out.println("Unsupported character set" + g);
		}

	}

}
