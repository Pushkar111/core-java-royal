package String_Manupulation.mutable.StringTokenizerClass.StringTokenizer_Methods.StringTokenizer_String_nextTokenString_delim_3;

import java.util.StringTokenizer;

public class TestApp {
	public static void main(String[] args) {

		StringTokenizer st = new StringTokenizer("My,name,is,Pushkar");

		while (st.hasMoreElements()) {
			System.out.println(st.nextToken(","));
		}

		System.out.println("--------------------------------------------");

		StringTokenizer st2 = new StringTokenizer("My,name,is_Pushkar");
		System.out.println(st2.nextToken("_"));
	}
}
