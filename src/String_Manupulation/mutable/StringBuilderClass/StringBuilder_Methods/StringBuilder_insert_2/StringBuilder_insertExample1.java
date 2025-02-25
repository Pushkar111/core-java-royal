package String_Manupulation.mutable.StringBuilderClass.StringBuilder_Methods.StringBuilder_insert_2;

public class StringBuilder_insertExample1 {
	public static void main(String[] args) {
//											012345
		StringBuilder sb = new StringBuilder("Hello ");
		sb.insert(1, "java"); // now original string is changed
		System.out.println(sb); // prints HJavaello

	}
}
