package String_Manupulation.mutable.StringBufferVsStringBuilder;

public class ConcatTest {

	public static String concatWithStringBuffer() {
		StringBuffer sb = new StringBuffer("Royal");
		for (int i = 0; i < 10000; i++) {
			sb.append("Technosoft");
		}
		return sb.toString();
	}

	public static String concatWithStringBuilder() {
		StringBuilder sB = new StringBuilder("Royal");
		for (int i = 0; i < 10000; i++) {
			sB.append("Technosoft");
		}
		return sB.toString();
	}

	public static void main(String[] args) {
		long startTime;

		startTime = System.currentTimeMillis();
		concatWithStringBuffer();
		System.out.println(
				"Time taken by Concating with StringBuffer: " + (System.currentTimeMillis() - startTime) + "ms");

		startTime = System.currentTimeMillis();
		concatWithStringBuilder();
		System.out.println(
				"Time taken by Concating with StringBuilder: " + (System.currentTimeMillis() - startTime) + "ms");
	}
}
