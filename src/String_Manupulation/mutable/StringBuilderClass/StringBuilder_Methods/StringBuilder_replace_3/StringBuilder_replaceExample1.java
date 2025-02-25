package String_Manupulation.mutable.StringBuilderClass.StringBuilder_Methods.StringBuilder_replace_3;

public class StringBuilder_replaceExample1 {
	public static void main(String args[]) {
// 										    01234
		StringBuilder sb = new StringBuilder("Hello");
		sb.replace(1, 3, "Java"); // upper index are exclusive(not included)
		System.out.println(sb); // prints HJavalo
	}

}
