package Array.Arr2D.JaggedArray;

/*
Jagged Array : Jagged Array is a 2d array in which we can Explicitely assign the number of column of each row
			   In Normal 2D array it is not possible because COL and ROW Size fixed
			 : Jagged Array Consists Subarrays which has different length

*/

public class JaggedArray
{
	public static void main(String[] args)
	{
		int[][] jaggedArray = new int[3][];

		jaggedArray[0] = new int[1]; // ROW-0 ---> COL-1
		jaggedArray[1] = new int[2]; // ROW-1 ---> COL-2
		jaggedArray[2] = new int[3]; // ROW-2 ---> COL-3

		// scan
		int value = 1;
		for (int i = 0; i < jaggedArray.length; i++)
		{
			for (int j = 0; j < jaggedArray[i].length; j++)
			{
				jaggedArray[i][j] = value++;
			}
		}

		// display
		for (int i = 0; i < jaggedArray.length; i++)
		{
			for (int j = 0; j < jaggedArray[i].length; j++)
			{
				System.out.print(jaggedArray[i][j] + "\t");
			}
			System.out.println();
		}
	}
}
