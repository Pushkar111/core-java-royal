package Tasks.Time_Distance_Class_Task;

class Time
{
	int hours, minutes;

	public Time(int hours, int minutes)
	{
		this.hours = hours;
		this.minutes = minutes;
	}

	Time add(Time t)
	{
		int TotalMinutes = this.minutes + t.minutes;
		int newHours = this.hours + t.hours + TotalMinutes / 60;
		int newMinutes = TotalMinutes % 60;

		return new Time(newHours, newMinutes);
	}

	void display()
	{
		System.out.println("Hours = " + hours + ", Minutes = " + minutes);
	}
}

public class TestApp1
{
	public static void main(String[] args)
	{
		Time t1 = new Time(3, 20);
		Time t2 = new Time(2, 20);

		t1.display();
		t2.display();

		Time t3 = t1.add(t2);

		t3.display();

	}
}
