package String_Manupulation.mutable.StringBufferVsStringBuilder;

public class InstanceTest {
	public static void main(String args[]) {
		System.out.println("Hashcode test of String:");
		String str = "Royal";
		System.out.println(str.hashCode());
		str = str + "Technosoft";
		System.out.println(str.hashCode());

		System.out.println("Hashcode test of StringBuffer:");
		StringBuffer sb = new StringBuffer("Royal");
		System.out.println(sb.hashCode());
		sb.append("Technosoft");
		System.out.println(sb.hashCode());

		System.out.println("Hashcode test of StringBuilder:");
		StringBuilder sB = new StringBuilder("Royal");
		System.out.println(sB.hashCode());
		sb.append("Technosoft");
		System.out.println(sB.hashCode());
	}
}
