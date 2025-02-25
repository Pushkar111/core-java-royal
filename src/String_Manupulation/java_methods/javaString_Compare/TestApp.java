package String_Manupulation.java_methods.javaString_Compare;

public class TestApp {
//	We can compare String in Java on the basis of content and reference.
//
//	It is used in authentication (by equals() method), sorting (by compareTo() method), reference matching (by == operator) etc.
//
//	There are three ways to compare String in Java:
//
//		1) By Using equals() Method
//		2) By Using == Operator
//		3) By compareTo() Method

	public static void main(String[] args) {

//	1) By Using equals() Method
//	The String class equals() method compares the original content of the string. It compares values of string for equality. String class provides the following two methods:

		String s1 = "Sachin";
		String s2 = "Sachin";
		String s3 = new String("Sachin");
		String s4 = "Saurav";
		System.out.println(s1.equals(s2));// true
		System.out.println(s1.equals(s3));// true
		System.out.println(s1.equals(s4));// false

		System.out.println();

		String s5 = "Sachin";
		String s6 = "SACHIN";

		System.out.println(s5.equals(s6));// false
		System.out.println(s5.equalsIgnoreCase(s6));// true

		System.out.println();

//		2) By Using == operator
//		The == operator compares references not values.
		String s7 = "Sachin";
		String s8 = "Sachin";
		String s9 = new String("Sachin");
		System.out.println(s7 == s8);// true (because both refer to same instance)
		System.out.println(s7 == s9);// false(because s3 refers to instance created in nonpool)

		System.out.println();

//		3) By Using compareTo() method
//		The String class compareTo() method compares values lexicographically and returns an integer value that describes if first string is less than, equal to or greater than second string.
//
//		Suppose s1 and s2 are two String objects. If:
//
//		s1 == s2 : The method returns 0.
//		s1 > s2 : The method returns a positive value.
//		s1 < s2 : The method returns a negative value.

		String s10 = "Sachin";
		String s11 = "Sachin";
		String s12 = "Ratan";
		System.out.println(s10.compareTo(s11));// 0
		System.out.println(s11.compareTo(s12));// 1(because s1>s3)
		System.out.println(s12.compareTo(s10));// -1(because s3 < s1 )

	}

}
