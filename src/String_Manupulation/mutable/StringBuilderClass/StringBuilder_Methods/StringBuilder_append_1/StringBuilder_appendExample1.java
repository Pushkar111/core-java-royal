package String_Manupulation.mutable.StringBuilderClass.StringBuilder_Methods.StringBuilder_append_1;

public class StringBuilder_appendExample1 {
	public static void main(String[] args) {
//  										012345	
		StringBuilder sb = new StringBuilder("Hello ");
		sb.append("java");// now original string is changed
		System.out.println(sb); // prints Hello Java
	}
}
