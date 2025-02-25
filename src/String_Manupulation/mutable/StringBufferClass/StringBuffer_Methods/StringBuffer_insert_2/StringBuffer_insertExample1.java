package String_Manupulation.mutable.StringBufferClass.StringBuffer_Methods.StringBuffer_insert_2;

public class StringBuffer_insertExample1 {
	public static void main(String[] args) {
//											012345
		StringBuffer sb = new StringBuffer("Hello ");
		sb.insert(1, "java"); // now original string is changed
		System.out.println(sb); // prints HJavaello

	}
}
