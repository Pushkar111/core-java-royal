package Java_Collection._2_Java_ArrayList_Class.Tasks;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class _5_How_to_Synchronize_ArrayList
{
	public static void main(String[] args)
	{
		List<String> listObj = new ArrayList<String>();

		listObj.add("Rahul");
		listObj.add("Sagar");
		listObj.add("Kunal");

		listObj.add("Shekhar");
		listObj.add("Janmay");

		// synchronizedList ArrayList in java
		listObj = Collections.synchronizedList(listObj);

		// we must use synchronize block to avoid non-deterministic behavior
		synchronized (listObj)
		{
			for (String str : listObj)
			{
				System.out.println(str);
			}
		}
	}
}
