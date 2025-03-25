package Tasks.Break_Continue;

public class BreakExample
{
	public static void main(String[] args)
	{
		for (int i = 1; i <= 10; i++)
		{
			if (i == 5)
			{
				break; // before 5 are print 
			} 
			System.out.println(i);
		}	
	}
	
	
	
	/*
		1
		2
		3
		4
	*/
}
