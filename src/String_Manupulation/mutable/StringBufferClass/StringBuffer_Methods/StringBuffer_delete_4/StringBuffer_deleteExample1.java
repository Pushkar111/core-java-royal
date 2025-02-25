package String_Manupulation.mutable.StringBufferClass.StringBuffer_Methods.StringBuffer_delete_4;

public class StringBuffer_deleteExample1 {
	public static void main(String args[]) {
// 											01234
		StringBuffer sb = new StringBuffer("Hello");
		sb.delete(1, 3);
		System.out.println(sb);// prints Hlo
	}
}
