package Tasks.ObjectPassing;

public class ObjectPassingEqual
{
	int a, b;

	ObjectPassingEqual(int a, int b)
	{
		this.a = a;
		this.b = b;
	}

	boolean isEqual(ObjectPassingEqual obj)
	{
		return (this.a == obj.a && this.b == obj.b);
	}

	public static void main(String[] args)
	{
		ObjectPassingEqual obj1 = new ObjectPassingEqual(100, 200);
		ObjectPassingEqual obj2 = new ObjectPassingEqual(100, 200);

		System.out.println(obj1.isEqual(obj2));

		ObjectPassingEqual obj3 = new ObjectPassingEqual(100, 100);
		ObjectPassingEqual obj4 = new ObjectPassingEqual(100, 200);

		System.out.println(obj3.isEqual(obj4));
	}
}
