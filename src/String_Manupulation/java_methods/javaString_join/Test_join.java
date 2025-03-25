package String_Manupulation.java_methods.javaString_join;

import java.util.StringJoiner;

public class Test_join
{

	public static void main(String[] args)
	{

//		1. Using String.join()
		String[] words1 = { "Hello", "World", "from", "Java" };
		String str1 = String.join(" ", words1);
		System.out.println(str1); // Output: Hello World from Java

//      2. Using StringBuilder
		String[] words2 = { "Hello", "World", "from", "Java" };
		StringBuilder sb = new StringBuilder();

		for (int i = 0; i < words2.length; i++)
		{
			sb.append(words2[i]);
			if (i < words2.length - 1)
			{
				sb.append(" ");
			}

		}
		String str2 = sb.toString();
		System.out.println(str2); // Output: Hello World from Java

//		3. Using StringJoiner
		StringJoiner sj = new StringJoiner(" ");
		sj.add("Hello");
		sj.add("World");
		sj.add("from");
		sj.add("Java");

		String str3 = sj.toString();
		System.out.println(str3);

	}
}
