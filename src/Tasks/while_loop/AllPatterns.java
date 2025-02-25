package Tasks.while_loop;

import java.util.Scanner;

public class AllPatterns {
	public static void main(String args[]) {
		int i, j, k, SIZE = 5;
		int choice;
		int no, flag = 1;
		int l = 2, m, odd = 1, even = 2;

		Scanner sc = new Scanner(System.in);

		System.out.println("-------------------------------------------------------------");
		System.out.println("|						Patterns							|");
		System.out.println("-------------------------------------------------------------");

		System.out.println("1. Square Pattern");
		System.out.println("2. Right Half Pyramid");
		System.out.println("3. Left Half Pyramid");
		System.out.println("4. Inverted Right Half Pyramid");
		System.out.println("5. Inverted Left Half Pyramid");
		System.out.println("6. Full Pyramid");
		System.out.println("7. Inverted Full Pyramid");
		System.out.println("8. Daimond Pattern");
		System.out.println("9. Hourglass Pattern");
		System.out.println("10. Rhombus Pattern");
		System.out.println("11. Hollow Square Pattern");
		System.out.println("12. Hollow Rhombus Pattern");
		System.out.println("13. Hollow Full Pyramid");
		System.out.println("14. Odd-Even Numbers");
		System.out.println("15. Unique Prime Diamond");
		System.out.println("16. Unique Odd Diamond");
		System.out.println("17. Unique Even Diamond");
		System.out.println("18. Right Half DIamond Pattern");
		System.out.println("19. Left Half Diamond Pattern");
		System.out.println("20. Palindrome Pattern");
		System.out.println("21. Zig-zag Pattern");
		System.out.println("22. Exit");
		System.out.println("-------------------------------------------------------------");

		System.out.print("\nEnter the choice : ");
		choice = sc.nextInt();

		switch (choice) {
		case 1:
			i = 1;
			while (i <= SIZE) {
				j = 1;
				while (j <= SIZE) {
					System.out.print("* ");
					j++;
				}
				System.out.print("\n");
				i++;
			}
			break;

		case 2:
			i = 1;
			while (i <= SIZE) {
				j = 1;
				while (j <= i) {
					System.out.print("* ");
					j++;
				}
				System.out.print("\n");
				i++;
			}
			break;

		case 3:
			i = 1;
			while (i <= SIZE) {
				k = (SIZE - i);
				while (k >= 1) {
					System.out.print(" ");
					k--;
				}
				j = 1;
				while (j <= i) {
					System.out.print("*");
					j++;
				}
				System.out.print("\n");
				i++;
			}
			break;

		case 4:
			i = SIZE;
			while (i >= 1) {
				j = 1;
				while (j <= i) {
					System.out.print("* ");
					j++;
				}
				System.out.print("\n");
				i--;
			}
			break;

		case 5:
			i = SIZE;
			while (i >= 1) {
				k = (SIZE - i);
				while (k >= 1) {
					System.out.print(" ");
					k--;
				}
				j = 1;
				while (j <= i) {
					System.out.print("*");
					j++;
				}
				System.out.print("\n");
				i--;
			}
			break;

		case 6:
			i = 1;
			while (i <= SIZE) {
				k = (SIZE - i);
				while (k >= 1) {
					System.out.print(" ");
					k--;
				}
				j = 1;
				while (j <= i) {
					System.out.print("* ");
					j++;
				}
				System.out.print("\n");
				i++;
			}
			break;

		case 7:
			i = SIZE;
			while (i >= 1) {
				k = (SIZE - i);
				while (k >= 1) {
					System.out.print(" ");
					k--;
				}
				j = 1;
				while (j <= i) {
					System.out.print("* ");
					j++;
				}
				System.out.print("\n");
				i--;
			}
			break;

		case 8:
			i = 1;
			while (i <= SIZE) {
				k = (SIZE - i);
				while (k >= 1) {
					System.out.print(" ");
					k--;
				}
				j = 1;
				while (j <= i) {
					System.out.print("* ");
					j++;
				}
				System.out.print("\n");
				i++;
			}

			i = (SIZE - 1);
			while (i >= 1) {
				k = (SIZE - i);
				while (k >= 1) {
					System.out.print(" ");
					k--;
				}
				j = 1;
				while (j <= i) {
					System.out.print("* ");
					j++;
				}
				System.out.print("\n");
				i--;
			}
			break;

		case 9:
			i = SIZE;
			while (i >= 1) {
				k = (SIZE - i);
				while (k >= 1) {
					System.out.print(" ");
					k--;
				}
				j = 1;
				while (j <= i) {
					System.out.print("* ");
					j++;
				}
				System.out.print("\n");
				i--;
			}

			i = 2;
			while (i <= SIZE) {
				k = (SIZE - i);
				while (k >= 1) {
					System.out.print(" ");
					k--;
				}
				j = 1;
				while (j <= i) {
					System.out.print("* ");
					j++;
				}
				System.out.print("\n");
				i++;
			}
			break;

		case 10:
			i = 1;
			while (i <= SIZE) {
				k = (SIZE - i);
				while (k >= 1) {
					System.out.print(" ");
					k--;
				}
				j = 1;
				while (j <= SIZE) {
					System.out.print("* ");
					j++;
				}
				System.out.print("\n");
				i++;
			}
			break;

		case 11:
			i = 1;
			while (i <= SIZE) {
				j = 1;
				while (j <= SIZE) {
					if (i > 1 && i < SIZE && j > 1 && j < SIZE) {
						System.out.print("  ");
					} else {
						System.out.print("* ");
					}
					j++;
				}
				System.out.print("\n");
				i++;
			}
			break;

		case 12:
			i = 1;
			while (i <= SIZE) {
				k = (SIZE - i);
				while (k >= 1) {
					System.out.print(" ");
					k--;
				}
				j = 1;
				while (j <= SIZE) {
					if (i > 1 && i < SIZE && j > 1 && j < SIZE) {
						System.out.print("  ");
					} else {
						System.out.print("* ");
					}
					j++;
				}
				System.out.print("\n");
				i++;
			}
			break;

		case 13:
			i = 0;
			while (i < 5) {
				k = 0;
				while (k <= 2 * (5 - i) - 1) {
					System.out.print(" ");
					k++;
				}
				j = 0;
				while (j < 2 * i + 1) {
					if (j == 0 || j == 2 * i || i == (5 - 1)) {
						System.out.print("* ");
					} else {
						System.out.print("  ");
					}
					j++;
				}
				System.out.print("\n");
				i++;
			}
			break;

		// Case 14: Odd-Even Numbers
		case 14:
			i = 1;
			while (i <= SIZE) {
				if (i % 2 == 0) {
					j = 1;
					while (j <= i) {
						System.out.print(j * 2 + " ");
						j++;
					}
				} else {
					j = 1;
					while (j <= i) {
						System.out.print((j * 2) - 1 + " ");
						j++;
					}
				}
				System.out.print("\n");
				i++;
			}
			break;

		// Case 15: Unique Prime Diamond
		case 15:
			i = 1;
			while (i <= SIZE) {
				k = (SIZE - i);
				while (k >= 1) {
					System.out.print(" ");
					k--;
				}
				j = 1;
				while (j <= i) {
					no = l;
					flag = 1;
					m = 2;
					while (m < no) {
						if (no % m == 0) {
							flag = 0;
							break;
						}
						m++;
					}
					if (flag == 1) {
						System.out.print(no + " ");
						j++;
					}
					l++;
				}
				System.out.print("\n");
				i++;
			}

			i = 4;
			while (i >= 1) {
				k = (SIZE - i);
				while (k >= 1) {
					System.out.print(" ");
					k--;
				}
				j = 1;
				while (j <= i) {
					no = l;
					flag = 1;
					m = 2;
					while (m < no) {
						if (no % m == 0) {
							flag = 0;
							break;
						}
						m++;
					}
					if (flag == 1) {
						System.out.print(no + " ");
						j++;
					}
					l++;
				}
				System.out.print("\n");
				i--;
			}
			break;

		case 16:
			i = 1;
			while (i <= SIZE) {
				k = (SIZE - i);
				while (k >= 1) {
					System.out.print(" ");
					k--;
				}
				j = 1;
				while (j <= i) {
					no = odd;
					flag = 1;
					m = 1;
					while (m < no) {
						if (no % 2 == 0) {
							flag = 0;
							break;
						}
						m++;
					}
					if (flag == 1) {
						System.out.print(no + " ");
						j++;
					}
					odd++;
				}
				System.out.print("\n");
				i++;
			}

			i = 4;
			while (i >= 1) {
				k = (SIZE - i);
				while (k >= 1) {
					System.out.print(" ");
					k--;
				}
				j = 1;
				while (j <= i) {
					no = odd;
					flag = 1;
					m = 1;
					while (m < no) {
						if (no % 2 == 0) {
							flag = 0;
							break;
						}
						m++;
					}
					if (flag == 1) {
						System.out.print(no + " ");
						j++;
					}
					odd++;
				}
				System.out.print("\n");
				i--;
			}
			break;

		// Case 17: Unique Even Diamond
		case 17:
			i = 1;
			while (i <= SIZE) {
				k = (SIZE - i);
				while (k >= 1) {
					System.out.print(" ");
					k--;
				}
				j = 1;
				while (j <= i) {
					no = even;
					flag = 1;
					m = 1;
					while (m < no) {
						if (no % 2 != 0) {
							flag = 0;
							break;
						}
						m++;
					}
					if (flag == 1) {
						System.out.print(no + " ");
						j++;
					}
					even++;
				}
				System.out.print("\n");
				i++;
			}

			i = 4;
			while (i >= 1) {
				k = (SIZE - i);
				while (k >= 1) {
					System.out.print(" ");
					k--;
				}
				j = 1;
				while (j <= i) {
					no = even;
					flag = 1;
					m = 1;
					while (m < no) {
						if (no % 2 != 0) {
							flag = 0;
							break;
						}
						m++;
					}
					if (flag == 1) {
						System.out.print(no + " ");
						j++;
					}
					even++;
				}
				System.out.print("\n");
				i--;
			}
			break;

		// Case 18: Right Half Diamond Pattern
		case 18:
			i = 1;
			while (i <= SIZE) {
				j = 1;
				while (j <= i) {
					System.out.print("*");
					j++;
				}
				System.out.print("\n");
				i++;
			}
			i = SIZE - 1;
			while (i >= 1) {
				j = 1;
				while (j <= i) {
					System.out.print("*");
					j++;
				}
				System.out.print("\n");
				i--;
			}
			break;

		// Case 19: Left Half Diamond Pattern
		case 19:
			i = 1;
			while (i <= SIZE) {
				k = (SIZE - i);
				while (k >= 1) {
					System.out.print(" ");
					k--;
				}
				j = 1;
				while (j <= i) {
					System.out.print("*");
					j++;
				}
				System.out.print("\n");
				i++;
			}

			i = SIZE - 1;
			while (i >= 1) {
				k = (SIZE - i);
				while (k >= 1) {
					System.out.print(" ");
					k--;
				}
				j = 1;
				while (j <= i) {
					System.out.print("*");
					j++;
				}
				System.out.print("\n");
				i--;
			}
			break;

		// Case 20: Palindrome Pattern
		case 20:
			i = 1;
			while (i <= SIZE) {
				k = i;
				j = 1;
				while (j <= (SIZE - i)) {
					System.out.print("  ");
					j++;
				}
				while (j <= SIZE) {
					System.out.print(k + " ");
					k--;
					j++;
				}
				k = 1;
				while (j < (SIZE + i)) {
					k++;
					System.out.print(k + " ");
					j++;
				}
				while (j <= (2 * SIZE - 1)) {
					System.out.print(" ");
					j++;
				}
				System.out.println();
				i++;
			}
			break;

		// Case 21: Zig-zag Pattern
		case 21:
			i = 1;
			while (i <= 3) {
				j = 1;
				while (j <= 10) {
					if (((i + j) % 4 == 0) || ((i == 2) && (j % 4 == 0))) {
						System.out.print("* ");
					} else {
						System.out.print("  ");
					}
					j++;
				}
				System.out.println();
				i++;
			}
			break;
		case 22:
			System.exit(0);
		}
	}
}