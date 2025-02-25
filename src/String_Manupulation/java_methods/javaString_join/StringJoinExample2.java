package String_Manupulation.java_methods.javaString_join;

public class StringJoinExample2 {

	public static void main(String[] args) {
		String date = String.join("/", "20", "05", "2024");
		System.out.println("Date: " + date);

		String time = String.join(":", "12", "10", "45");
		System.out.println("Time: " + time);
	}

}
