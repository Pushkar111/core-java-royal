package String_Manupulation.java_methods.javaString_join;

public class StringJoinExample5 {
	public static void main(String[] args) {
		String str = null;

		// one of the element is null however it will be treated as normal string
		str = String.join("-", null, " Wake Up ", " eat ", " write content for JTP ", " eat ", " sleep ");
		System.out.println(str);
	}
}
