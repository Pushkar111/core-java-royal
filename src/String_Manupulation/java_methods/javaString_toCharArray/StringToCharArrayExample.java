package String_Manupulation.java_methods.javaString_toCharArray;

public class StringToCharArrayExample
{
	public static void main(String[] args)
	{
		String str = "Royal Technosoft P Limited";
		char[] ch = str.toCharArray();
		System.out.println("Char Array length: " + ch.length);
		System.out.println("Char Array elements: ");
		for (int i = 0; i < ch.length; i++)
		{
			System.out.print(ch[i]);
		}
	}
}
