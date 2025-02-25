package String_Manupulation.mutable.StringVsStringBuffer;

public class ConcatTest {
	public static String concatWithString() {
		String str = "Royal";
		for (int i = 0; i < 10000; i++) {
			str = str + "Technosoft";
		}
		return str;
	}

	public static String concatWithStringBuffer() {
		StringBuffer sb = new StringBuffer("Royal");
		for (int i = 0; i < 10000; i++) {
			sb.append("Technosoft");
		}
		return sb.toString();
	}

	public static void main(String[] args) {
		long startTime;

		startTime = System.currentTimeMillis();
		concatWithString();
		System.out.println("Time taken by Concating with String: " + (System.currentTimeMillis() - startTime) + "ms");

		startTime = System.currentTimeMillis();
		concatWithStringBuffer();
		System.out.println(
				"Time taken by Concating with StringBuffer: " + (System.currentTimeMillis() - startTime) + "ms");
	}
}
