package Tasks.Break_Continue;

public class ContinueExample
{
	public static void main(String[] args)
	{
		for (int i = 1; i <= 10; i++)
		{
			if (i == 5)
			{
				continue; // 5 will skip 
			}
			System.out.println(i);
		}
	}
	
	/*
		1
		2
		3
		4
		6
		7
		8
		9
		10
	*/
}
