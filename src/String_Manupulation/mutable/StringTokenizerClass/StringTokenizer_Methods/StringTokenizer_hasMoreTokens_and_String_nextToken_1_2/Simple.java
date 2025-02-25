package String_Manupulation.mutable.StringTokenizerClass.StringTokenizer_Methods.StringTokenizer_hasMoreTokens_and_String_nextToken_1_2;

import java.util.StringTokenizer;

public class Simple {
	public static void main(String[] args) {

		StringTokenizer st = new StringTokenizer("My name is Pushkar");

		while (st.hasMoreElements()) {
//			String str = st.nextToken();
//			System.out.println(str);
			System.out.println(st.nextToken());
		}

	}
}
