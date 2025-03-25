package String_Manupulation.mutable.StringTokenizerClass.StringTokenizer_Methods.StringTokenizer_countTokens_6;

import java.util.StringTokenizer;

public class TestApp
{
	public static void main(String[] args)
	{

		StringTokenizer st = new StringTokenizer("My name is Pushkar");
		System.out.println(st.countTokens());

		System.out.println("------------------------------");

		StringTokenizer st2 = new StringTokenizer("My,name,is-Pushkar", "-");
		System.out.println(st2.countTokens());

		String name = "This is Java";
		StringTokenizer st1 = new StringTokenizer(name);
		System.out.println(st1.countTokens());
	}
}
