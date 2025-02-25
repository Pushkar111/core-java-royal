package String_Manupulation.mutable.StringTokenizerClass.StringTokenizer_Methods.StringTokenizer_hasMoreTokens_and_String_nextToken_1_2;

import java.util.StringTokenizer;

public class TestApp1 {
	public static void main(String args[]) {

		StringTokenizer st = new StringTokenizer("My name is Pushkar", " ");

		while (st.hasMoreTokens()) {
			System.out.println(st.nextToken());
		}

		System.out.println("-------------------------------------");
		StringTokenizer st2 = new StringTokenizer("My,name,is,Pushkar", ",");

		while (st2.hasMoreTokens()) {
			System.out.println(st2.nextToken());
		}
	}
}
