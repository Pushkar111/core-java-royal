package Tasks.Time_Distance_Class_Task;

class DISTANCE
{
	int km, m;

	public DISTANCE(int km, int m)
	{
		this.km = km;
		this.m = m;
	}

	DISTANCE add(DISTANCE d)
	{
		int totalMeters = this.m + d.m;
		int newKm = this.km + d.km + totalMeters / 1000;
		int newM = totalMeters % 1000;

		return new DISTANCE(newKm, newM);
	}

	void display()
	{
		System.out.println("Km = " + km + ", M = " + m);
	}
}

public class TestApp2
{
	public static void main(String[] args)
	{
		DISTANCE d1 = new DISTANCE(2, 300);
		DISTANCE d2 = new DISTANCE(2, 900);

		d1.display();
		d2.display();

		DISTANCE d3 = d1.add(d2);
		d3.display();
	}
}
