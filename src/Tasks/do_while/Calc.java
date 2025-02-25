package Tasks.do_while;

import java.util.Scanner;

public class Calc
{
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		char choice = 'Y'; // Initialize choice to a default value

		do
		{
			System.out.println("Enter first number:");
			double num1 = scanner.nextDouble();

			System.out.println("Enter second number:");
			double num2 = scanner.nextDouble();

			System.out.println("Choose an operation (+, -, *, /):");
			char operator = scanner.next().charAt(0);

			double result = 0;

			switch (operator)
			{
			case '+':
				result = num1 + num2;
				break;
			case '-':
				result = num1 - num2;
				break;
			case '*':
				result = num1 * num2;
				break;
			case '/':
				if (num2 != 0)
				{
					result = num1 / num2;
				} else
				{
					System.out.println("Error! Division by zero.");
					continue;
				}
				break;
			default:
				System.out.println("Invalid operator!");
				continue;
			}

			System.out.println("Result: " + result);

			System.out.println("Do you want to perform another calculation? (Y/N)");
			choice = scanner.next().charAt(0);
		} while (choice == 'Y' || choice == 'y');

		scanner.close();
		System.out.println("Calculator closed.");
	}
}
