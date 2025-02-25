package String_Manupulation.immutable.By_String_Literal_Way;

public class TestApp
{
	public static void main(String[] args)
	{

//	1) ImmutableWay(String):-
//	---------------------------------------------------------------------------------
		//
		// 1) By String Literal Way[RAM------HEAP-----["SCP"]--["String Constant
		// Pool"]]:-
		// ---------------------------
		String name1 = "rahul";
		String name2 = "rahul";
		String name3 = name1;
		String name5 = "sagar";
		// rahul kirpekar
		String name4 = name1.concat(" Kirpekar");

		System.out.println("reference:-");
		System.out.println("------------------");

		System.out.println((name1 == name2));// true
		System.out.println((name1 == name3));// true
		System.out.println((name1 == name4));// false
		System.out.println((name1 == name5));// false
		System.out.println();

		System.out.println("value:-");
		System.out.println("------------------");

		System.out.println(name1.equals(name2));// true
		System.out.println(name1.equals(name3));// true
		System.out.println(name1.equals(name4));// false
		System.out.println(name1.equals(name5));// false
		System.out.println();
		System.out.println(name4);// rahul kirpekar
		System.out.println();

	}
}
