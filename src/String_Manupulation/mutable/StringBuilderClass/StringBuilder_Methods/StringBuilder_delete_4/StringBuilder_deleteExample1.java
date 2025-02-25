package String_Manupulation.mutable.StringBuilderClass.StringBuilder_Methods.StringBuilder_delete_4;

public class StringBuilder_deleteExample1 {
	public static void main(String args[]) {
// 											01234
		StringBuilder sb = new StringBuilder("Hello");
		sb.delete(1, 3);
		System.out.println(sb);// prints Hlo
	}
}
