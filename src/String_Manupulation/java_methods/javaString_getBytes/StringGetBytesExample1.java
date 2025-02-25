package String_Manupulation.java_methods.javaString_getBytes;

public class StringGetBytesExample1 {

	public static void main(String[] args) {
		String s1 = "ABCDEFGHIJKLMNOPQRSTUVWXYZ abcdefghijklmnopqrstuvwxyz";
		byte[] barr = s1.getBytes();

		for (int i = 0; i < barr.length; i++) {
			System.out.println(s1.charAt(i) + " → " + barr[i]);
		}
	}

}
