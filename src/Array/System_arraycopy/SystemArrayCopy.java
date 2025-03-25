package Array.System_arraycopy;

import java.util.Arrays;

/*

System.arraycopy(sourceArray, sourcePos, destinationArray, destPos, length);

*/

public class SystemArrayCopy
{
	public static void main(String[] args)
	{
		int[] source = { 1, 2, 3, 4, 5 };
		int[] destination = new int[source.length];

		// Full copy
		System.arraycopy(source, 0, destination, 0, destination.length);

		System.out.println("source: " + Arrays.toString(source));
		System.out.println("destination: " + Arrays.toString(destination));

		// Partial copy
		int a[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		int b[] = new int[5];
		System.arraycopy(a, 3, b, 0, b.length);

		System.out.println("a: " + Arrays.toString(a));
		System.out.println("b: " + Arrays.toString(b));

		// String Array copy
		String[] fruit1 = { "Apple", "Banana", "Cherry", "Date", "Elderberry" };
		String[] fruit2 = new String[3];

		System.arraycopy(fruit1, 1, fruit2, 0, fruit2.length);

		System.out.println("fruit1: " + Arrays.toString(fruit1));
		System.out.println("fruit2: " + Arrays.toString(fruit2));
	}
}
