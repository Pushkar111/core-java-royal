package oops.cls;

import java.util.Scanner;

class Circle
{
	double getArea(double radius)
	{
		return Math.PI * radius * radius;
	}
}

public class TestCircle
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the Radius : ");
		double radius = sc.nextDouble();

		Circle obj = new Circle();
		double area = obj.getArea(radius);

		System.out.println("Area of Circle Radius " + radius + " is " + area);
	}
}
