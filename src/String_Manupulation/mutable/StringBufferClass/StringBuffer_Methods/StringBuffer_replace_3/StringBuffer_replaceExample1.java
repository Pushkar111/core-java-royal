package String_Manupulation.mutable.StringBufferClass.StringBuffer_Methods.StringBuffer_replace_3;

public class StringBuffer_replaceExample1 {
	public static void main(String args[]) {
// 										    01234
		StringBuffer sb = new StringBuffer("Hello");
		sb.replace(1, 3, "Java"); // upper index are exclusive(not included)
		System.out.println(sb); // prints HJavalo
	}

}
