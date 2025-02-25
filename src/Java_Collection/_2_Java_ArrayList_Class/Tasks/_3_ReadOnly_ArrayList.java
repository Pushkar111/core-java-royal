package Java_Collection._2_Java_ArrayList_Class.Tasks;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class _3_ReadOnly_ArrayList
{
	public static void main(String[] args)
	{
		ArrayList<String> l1 = new ArrayList<String>(Arrays.asList("Ahemdabad", "Baroda", "Surat", "Gandhinagr"));

		System.out.println(l1);

		ArrayList<String> l2_unModified = (ArrayList<String>) Collections.unmodifiableList(l1);
		l2_unModified.add("California");
		l2_unModified.clear();
		System.out.println("UnsupportedOperationException : " + l2_unModified);
	}
}
