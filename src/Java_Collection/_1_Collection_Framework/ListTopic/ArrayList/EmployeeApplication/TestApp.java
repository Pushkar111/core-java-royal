package Java_Collection._1_Collection_Framework.ListTopic.ArrayList.EmployeeApplication;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class TestApp
{
	private static ArrayList<Employee> listObj = new ArrayList<Employee>();
	private static Scanner sc = new Scanner(System.in);

	public static void main(String[] args)
	{
		while (true)
		{
			System.out.println("\n-----------------------------------------------");
			System.out.println("           Employee Management System          ");
			System.out.println("-----------------------------------------------");
			System.out.println("1. Add Employees");
			System.out.println("2. Display All Employees");
			System.out.println("3. Search Employee By EID");
			System.out.println("4. Update Employee");
			System.out.println("5. Remove Employee");
			System.out.println("6. Sorting");
			System.out.println("7. Exit Application");
			System.out.println("-----------------------------------------------");

			System.out.println("Enter the choice : ");
			int choice = sc.nextInt();

			switch (choice)
			{
			case 1:
				addEmployee();
				break;

			case 2:
				dispAllEmployee();
				break;

			case 3:
				searchEmployee();
				break;

			case 4:
				updateEmployee();
				break;

			case 5:
				removeEmployee();
				break;

			case 6:
				System.out.println("----------------------------------");
				System.out.println("        Choose Sorting style      ");
				System.out.println("----------------------------------");
				System.out.println("1) Eid Wise Sorting");
				System.out.println("2) Name Wise Sorting");
				System.out.println("3) Salary Wise Sorting");
				System.out.println("4) Dsgn Wise Sorting");
				System.out.println("5) exit");
				System.out.println("----------------------------------");

				System.out.println("Enter choice : ");
				choice = sc.nextInt();

				switch (choice)
				{
				case 1:
					System.out.println("1) ASC");
					System.out.println("2) DESC");
					System.out.println("3) exit");

					System.out.println("Enter choice : ");
					choice = sc.nextInt();

					switch (choice)
					{
					case 1:
						Collections.sort(listObj, new EidWiseComparator());
						System.out.println("Employee Eid By Sorting in ASC Successfully!");
						break;

					case 2:
						Collections.sort(listObj, new EidWiseComparator());
						Collections.reverse(listObj);
						System.out.println("Employee Eid By Sorting in DESC Successfully!");
						break;

					case 3:
						exitApplication();
						break;

					default:
						System.out.println("Invalid choice !");
						break;
					}
					break;

				case 2:
					System.out.println("1) ASC");
					System.out.println("2) DESC");
					System.out.println("3) exit");

					System.out.println("Enter choice : ");
					choice = sc.nextInt();

					switch (choice)
					{
					case 1:
						Collections.sort(listObj, new NameWiseComparator());
						System.out.println("Employee Name By Sorting in ASC Successfully!");
						break;

					case 2:
						Collections.sort(listObj, new NameWiseComparator());
						Collections.reverse(listObj);
						System.out.println("Employee Name By Sorting in DESC Successfully!");
						break;

					case 3:
						exitApplication();
						break;

					default:
						System.out.println("Invalid choice !");
						break;
					}
					break;

				case 3:
					System.out.println("1) ASC");
					System.out.println("2) DESC");
					System.out.println("3) exit");

					System.out.println("Enter choice : ");
					choice = sc.nextInt();

					switch (choice)
					{
					case 1:
						Collections.sort(listObj, new SalaryWiseComparator());
						System.out.println("Employee Salary By Sorting in ASC Successfully!");
						break;

					case 2:
						Collections.sort(listObj, new SalaryWiseComparator());
						Collections.reverse(listObj);
						System.out.println("Employee Salary By Sorting in DESC Successfully!");
						break;

					case 3:
						exitApplication();
						break;

					default:
						System.out.println("Invalid choice !");
						break;
					}
					break;

				case 4:
					System.out.println("1) ASC");
					System.out.println("2) DESC");
					System.out.println("3) exit");

					System.out.println("Enter choice : ");
					choice = sc.nextInt();

					switch (choice)
					{
					case 1:
						Collections.sort(listObj, new DsgnWiseComparator());
						System.out.println("Employee dsgn By Sorting in ASC Successfully!");
						break;

					case 2:
						Collections.sort(listObj, new DsgnWiseComparator());
						Collections.reverse(listObj);
						System.out.println("Employee dsgn By Sorting in DESC Successfully!");
						break;

					case 3:
						exitApplication();
						break;

					default:
						System.out.println("Invalid choice !");
						break;
					}
					break;

				case 5:
					exitApplication();
					break;

				default:
					System.out.println("Invalid choice !");
					break;
				}
				break;

			case 7:
				exitApplication();
				break;

			default:
				System.out.println("Invalid choice. Please try again.");

			} // end of switch
		} // end of while
	}

	private static void addEmployee()
	{
		System.out.println("\n-----------------------------------------------");
		System.out.println("            Add Employee                        ");
		System.out.println("-----------------------------------------------");

		Boolean flag = false;
		Employee objScan = new Employee();
		objScan.scanData();

		for (int i = 0; i < listObj.size(); i++)
		{
			Employee existingObj = listObj.get(i);
			if (objScan.getEid() == existingObj.getEid())
			{
				flag = true;
				break;
			}
		}

		if (flag)
		{
			System.out.println("EID already exists. Please enter a unique EID.");
		} else
		{
			listObj.add(objScan);
			System.out.println("Employee added successfully!");
		}
	}

	private static void dispAllEmployee()
	{
		System.out.println("\n-----------------------------------------------");
		System.out.println("            Display All Employees               ");
		System.out.println("-----------------------------------------------");

		if (listObj.isEmpty())
		{
			System.out.println("No students found!");
		} else
		{
			for (int i = 0; i < listObj.size(); i++)
			{
				Employee s = listObj.get(i);
				s.dispData();
				System.out.println();
			}
		}
	}

	private static void searchEmployee()
	{
		System.out.println("\n-----------------------------------------------");
		System.out.println("            Search Employee By EID             ");
		System.out.println("-----------------------------------------------");

		Boolean flag = false;
		int i = 0;
		System.out.println("Enter Eid You Wants to Search in Record : ");
		int searchEid = sc.nextInt();

		for (i = 0; i < listObj.size(); i++)
		{
			Employee searchObj = listObj.get(i);
			if (searchEid == searchObj.getEid())
			{
				flag = true;
				break;
			}
		}

		if (flag)
		{
			Employee searchObj = listObj.get(i);
			searchObj.dispData();
			System.out.println("Employee found!");
		} else
		{
			System.out.println("Employee not found!");
		}
	}

	private static void updateEmployee()
	{
		System.out.println("\n-----------------------------------------------");
		System.out.println("            Update Employee                    ");
		System.out.println("-----------------------------------------------");

		boolean flag = false;
		int i = 0;
		System.out.println("Enter Eid You Wants to Update in Record : ");
		int updateEid = sc.nextInt();

		for (i = 0; i < listObj.size(); i++)
		{
			Employee updateObj = listObj.get(i);
			if (updateEid == updateObj.getEid())
			{
				flag = true;
				break;
			}
		}

		if (flag)
		{
			Employee updateObj = listObj.get(i);
			updateObj.updateData();
			listObj.set(i, updateObj);
			System.out.println("Employee updated successfully!");
		} else
		{
			System.out.println("Employee not found!");
		}
	}

	private static void removeEmployee()
	{
		System.out.println("\n-----------------------------------------------");
		System.out.println("            Remove Employee                    ");
		System.out.println("-----------------------------------------------");

		boolean flag = false;
		int i = 0;
		System.out.println("Enter Eid You Wants to Remove from Record : ");
		int searchEid = sc.nextInt();

		for (i = 0; i < listObj.size(); i++)
		{
			Employee searchObj = listObj.get(i);
			if (searchEid == searchObj.getEid())
			{
				flag = true;
				break;
			}
		}

		if (flag)
		{
			listObj.remove(i);
			System.out.println("Employee Remove Successfully!");
		} else
		{
			System.out.println("Employee not found!");
		}
	}

	private static void exitApplication()
	{
		try
		{
			Thread.sleep(500);
		} catch (InterruptedException e)
		{
			e.printStackTrace();
		}
		System.out.println("======================== Application Closed Successfully ========================");
		System.exit(0);
	}

}
