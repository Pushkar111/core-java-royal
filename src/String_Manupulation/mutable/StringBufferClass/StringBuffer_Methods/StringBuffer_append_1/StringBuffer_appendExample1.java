package String_Manupulation.mutable.StringBufferClass.StringBuffer_Methods.StringBuffer_append_1;

public class StringBuffer_appendExample1 {
	public static void main(String[] args) {
//  										012345	
		StringBuffer sb = new StringBuffer("Hello ");
		sb.append("java");// now original string is changed
		System.out.println(sb); // prints Hello Java
	}
}
