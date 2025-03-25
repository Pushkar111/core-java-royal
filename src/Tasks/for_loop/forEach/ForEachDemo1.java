package Tasks.for_loop.forEach;

public class ForEachDemo1
{
	/*
	 * The for-each loop is used to traverse array or collection in java. It is
	 * easier to use than simple for loop because we don't need to increment value
	 * and use subscript notation. It works on elements basis not index. It returns
	 * element one by one in the defined variable.
	 * 
	 */
	public static void main(String[] args)
	{
		String[] fruits = { "Banana", "Apple", "Orange", "Pinepale" };

		for (String fruit : fruits) // Type variableName  :  array
		{
			System.out.println(fruit);
		}
	}
}
