package Java_Collection._1_Collection_Framework.MapTopic.HashMap;

import java.util.HashMap;
import java.util.Map;

public class TestApp
{
	public static void main(String[] args)
	{
		// Generic
		HashMap<Integer, String> mapObj = new HashMap<Integer, String>();

		mapObj.put(11, "Rahul");
		mapObj.put(72, "Sagar");
		mapObj.put(53, "Kirtan");
		mapObj.put(24, "Sagar");
		mapObj.put(55, "Mehul");
		mapObj.put(96, "Kunal");
		mapObj.put(67, "Mehul");

		for (Map.Entry<Integer, String> e : mapObj.entrySet())
		{
			System.out.println(e.getKey() + " " + e.getValue());
		}
	}
}
