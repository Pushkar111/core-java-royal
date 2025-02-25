package Java_Collection._2_Java_ArrayList_Class.Tasks;

import java.util.ArrayList;
import java.util.Collections;

public class _7_Sort_Java_ArrayList_DSC
{
	public static void main(String[] args)
	{
		ArrayList<Integer> noList = new ArrayList<Integer>();

		noList.add(34);
		noList.add(4);
		noList.add(324);
		noList.add(14);
		noList.add(234);

		Collections.sort(noList);
		System.out.println("Sorting in ASC");
		System.out.println("-----------------------------");
		noList.forEach(str -> {
			System.out.println(str);
		});

		System.out.println();

		Collections.reverse(noList);
		System.out.println("Sorting in DSC");
		System.out.println("-----------------------------");
		noList.forEach(str -> {
			System.out.println(str);
		});

	}
}
