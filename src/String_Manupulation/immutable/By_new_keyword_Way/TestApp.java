package String_Manupulation.immutable.By_new_keyword_Way;

public class TestApp {
	public static void main(String[] args) {

//		2) By 'new' keyword way[RAM------["HEAP"]]:-
//		----------------------------------------------
		String name1 = new String("rahul");
		String name2 = new String("rahul");
		String name3 = new String(name1);
		String name5 = new String("sagar");
		// rahul kirpekar
		String name4 = name1.concat(" Kirpekar");

		System.out.println();

		System.out.println("reference:-");
		System.out.println("------------------");

		System.out.println(name1 == name2);// false
		System.out.println(name1 == name3);// true
		System.out.println(name1 == name4);// false
		System.out.println(name1 == name5);// false

		System.out.println();

		System.out.println("Value:-");
		System.out.println("------------------");

		System.out.println(name1.equals(name2));// true
		System.out.println(name1.equals(name3));// true
		System.out.println(name1.equals(name4));// false
		System.out.println(name1.equals(name5));// false

	}
}