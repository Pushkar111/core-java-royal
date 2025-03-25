package Basic;

// A -> not write main method then it will throw an error when we run that class using java A.java
// in fileName.java main aek bhi class agar public na ho then we can write any fileName in our java program
// we can set our java fileName .java [blank.java] also if in our java file not any one class can be public
// .java [blank.java] can be compile using javac .java but not run because class file is not available so throw an error class not found

/*
 * Data Types 
 * 1. Boolean --> 1 bit 
 * 2. byte    --> 1 byte [-2^7 to 2^7-1]
 * 
 * 3. char    ---> 2 byte [-2^15 to 2^15-1]
 * 4. short   ---> 2 byte [-2^15 to 2^15-1]
 * 
 * 5. int     ---> 4 byte [-2^31 to 2^31-1]
 * 6. long    ---> 8 byte [-2^63 to 2^63-1]
 * 
 * 5. float   ---> 4 byte [-2^31 to 2^31-1]  
 * 6. double  ---> 8 byte [-2^63 to 2^63-1]  
 */

class A
{

}

class B
{
	public static void main(String args[])
	{
		System.out.println("B ---> main()");
	}
}

class C
{
	public static void main(String args[])
	{

		System.out.println("C ---> main()");
	}
}

class D
{
	public static void main(String args[])
	{
		System.out.println("D ---> main()");
	}
}

class E
{
	public static void main(String args[])
	{
		System.out.println("E ---> main()");
	}
}

public class TestApp1
{
	public static void main(String[] args)
	{
		System.out.println("TestApp1 --> main()");
	}
}
