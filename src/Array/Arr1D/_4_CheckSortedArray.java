package Array.Arr1D;

public class _4_CheckSortedArray
{
	public static boolean isSorted(int a[])
	{
		boolean flag = true;
		for (int i = 0; i < a.length - 1; i++)
		{
			if (a[i] > a[i + 1])
			{
				flag = false;
				break;
			}
		}

		return flag;
	}

	public static void main(String[] args)
	{
		int a[] = { 1, 2, 3, 4, 5 };
		if (isSorted(a))
		{
			System.out.println("Sorted");
		} else
		{
			System.out.println("UnSorted");
		}

	}
}
