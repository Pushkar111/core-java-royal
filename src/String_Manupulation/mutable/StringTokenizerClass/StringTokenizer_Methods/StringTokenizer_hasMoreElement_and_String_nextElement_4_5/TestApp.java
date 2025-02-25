// similar to boolean hasMoreTokens() and String nextToken()

// boolean hasMoreElements() and Object nextElement()

package String_Manupulation.mutable.StringTokenizerClass.StringTokenizer_Methods.StringTokenizer_hasMoreElement_and_String_nextElement_4_5;

import java.util.StringTokenizer;

public class TestApp {
	public static void main(String args[]) {
		StringTokenizer st = new StringTokenizer("My name is Pushkar", " ");

		while (st.hasMoreElements()) {
			System.out.println(st.nextElement());
		}

		System.out.println("-------------------------------------");
		StringTokenizer st2 = new StringTokenizer("My,name,is,Pushkar", ",");

		while (st2.hasMoreElements()) {
			System.out.println(st2.nextElement());
		}
	}
}
