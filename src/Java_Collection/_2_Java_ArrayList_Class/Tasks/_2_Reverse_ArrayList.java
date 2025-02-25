package Java_Collection._2_Java_ArrayList_Class.Tasks;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class _2_Reverse_ArrayList
{
	public static void main(String[] args)
	{
		ArrayList<Integer> noList = new ArrayList<Integer>(Arrays.asList(1, 2, 3, 4, 5));

		System.out.println("Normal ArrayList : " + noList);

		// reverse ArrayList
		Collections.reverse(noList);

		System.out.println("Reverse ArrayList : " + noList);

	}
}
