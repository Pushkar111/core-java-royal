package jdbc.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Scanner;

import jdbc.bean.EmployeeBean;
import jdbc.util.DBConnection;

// EmployeeDao --> Employees Table
public class EmployeeDao
{
	// insert query for Employees Table
	public int insertEmployee(EmployeeBean ebean)
	{
		int rowsAffected = 0;
		String insertQuery = "INSERT INTO EMPLOYEES (FIRST_NAME, LAST_NAME, SALARY) VALUES ('" + ebean.getFirstName()
				+ "','" + ebean.getLastName() + "'," + ebean.getSalary() + ")";

		System.out.println("insertQuery : " + insertQuery);

		// 1) Database Object
		Connection conn = DBConnection.getConnection();

		// 2) Validate Connection Object
		if (conn != null)
		{
			try
			{
				// 3) create stmt object
				Statement stmt = conn.createStatement();

				// 4) execute sql insert query and store rowsAffected
				rowsAffected = stmt.executeUpdate(insertQuery);

			} catch (SQLException e)
			{
				e.printStackTrace();
			}
		} else
		{
			System.out.println("EmployeeDao insertEmployee() :: DB not connected");
		}

		// 5) return rowsAffected
		return rowsAffected;
	}

	public int updateEmployee(EmployeeBean ebean)
	{
		int rowsAffected = 0;
		String updateQuery = "UPDATE EMPLOYEES SET FIRST_NAME = '" + ebean.getFirstName() + "', LAST_NAME = '"
				+ ebean.getLastName() + "', SALARY = " + ebean.getSalary() + " WHERE EMPLOYEE_ID = " + ebean.getEmpId()
				+ "";
		System.out.println("updateQuery : " + updateQuery);

		// 1) Database Connection Object
		Connection conn = DBConnection.getConnection();

		// Validate Connection Object
		if (conn != null)
		{
			try
			{
				// 3) create stmt object
				Statement stmt = conn.createStatement();

				// 4) execute update Query and store rowsAffected
				rowsAffected = stmt.executeUpdate(updateQuery);

			} catch (SQLException e)
			{
				e.printStackTrace();
			}
		} else
		{
			System.out.println("Employees updateEmployee() :: DB not connected");
		}

		// 5) return rowsAffected
		return rowsAffected;
	}

	public int deleteEmployee(EmployeeBean ebean)
	{
		int rowsAffected = 0;
		String deleteQuery = "DELETE FROM EMPLOYEES WHERE EMPLOYEE_ID = " + ebean.getEmpId() + "";
		System.out.println("deleteQuery : " + deleteQuery);

		// 1) Database Connection Object
		Connection conn = DBConnection.getConnection();

		// 2) Validate Connection Object
		if (conn != null)
		{
			try
			{
				// 3) create stmt object
				Statement stmt = conn.createStatement();

				// 4) execute delete query and store rowsAffected
				rowsAffected = stmt.executeUpdate(deleteQuery);

			} catch (SQLException e)
			{
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} else
		{
			System.out.println("Employees deleteEmployee() :: DB not connected");
		}
		// 5) return rowsAffected
		return rowsAffected;
	}

	public ArrayList<EmployeeBean> getAllEmployees()
	{
		EmployeeBean ebean = null;
		ArrayList<EmployeeBean> list = new ArrayList<EmployeeBean>();

		String selectQuery = "SELECT * FROM EMPLOYEES";
		System.out.println("selectQuery : " + selectQuery);

		// 1) Database Connection Object
		Connection conn = DBConnection.getConnection();

		// 2) Validate Connection Object
		if (conn != null)
		{
			try
			{
				// 3) create stmt Object
				Statement stmt = conn.createStatement();

				// 4) execute select Query
				ResultSet result = stmt.executeQuery(selectQuery);

				System.out.println("\n--> Using ResultSet");
				System.out.println("EMPLOYEE_ID\tFIRST_NAME\tLAST_NAME\tSALARY");
				System.out.println("-----------\t----------\t---------\t------");
				while (result.next())
				{
					int empId = result.getInt("EMPLOYEE_ID");
					String firstName = result.getString("FIRST_NAME");
					String lastName = result.getString("LAST_NAME");
					int salary = result.getInt("SALARY");

					System.out.println(empId + "\t\t" + firstName + "\t\t" + lastName + "\t\t" + salary);

					ebean = new EmployeeBean(empId, firstName, lastName, salary);
					list.add(ebean);
				}

			} catch (SQLException e)
			{
				e.printStackTrace();
			}

		} else
		{
			System.out.println("Employees getAllEmployees() :: DB not connected");
		}
		return list;
	}

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);

		EmployeeDao dao = new EmployeeDao();
		EmployeeBean ebean = null;

		String firstName, lastName;
		int salary, empId;
		int rowsAffected = 0;

		while (true)
		{
			System.out.println("============================================================");
			System.out.println("                    Employee JDBC");
			System.out.println("============================================================");
			System.out.println("1. Insert Employee");
			System.out.println("2. Update Employee");
			System.out.println("3. Delete Employee");
			System.out.println("4. Display Employee");
			System.out.println("5. Exit");
			System.out.println("============================================================");

			System.out.println("Enter choice : ");
			int choice = sc.nextInt();

			switch (choice)
			{
			case 1:
				sc.nextLine();
				System.out.println("Enter FirstName : ");
				firstName = sc.nextLine();
				System.out.println("Enter LastName : ");
				lastName = sc.nextLine();
				System.out.println("Enter Salary : ");
				salary = sc.nextInt();

				ebean = new EmployeeBean(0, firstName, lastName, salary);
				rowsAffected = dao.insertEmployee(ebean);

				if (rowsAffected > 0)
				{
					System.out.println("Employee Record inserted Successfully");
				} else
				{
					System.out.println("Employee Record not inserted or not founded");
				}
				break;

			case 2:
				System.out.println("Enter Employee ID : ");
				empId = sc.nextInt();
				sc.nextLine();
				System.out.println("Enter FirstName : ");
				firstName = sc.nextLine();
				System.out.println("Enter LastName : ");
				lastName = sc.nextLine();
				System.out.println("Enter Salary : ");
				salary = sc.nextInt();

				ebean = new EmployeeBean(empId, firstName, lastName, salary);
				rowsAffected = dao.updateEmployee(ebean);

				if (rowsAffected > 0)
				{
					System.out.println("Employee Record Updated Successfully");
				} else
				{
					System.out.println("Employee Record not inserted or not founded");
				}
				break;

			case 3:
				System.out.println("Enter Employee ID u want to Delete : ");
				int deleteId = sc.nextInt();

				ebean = new EmployeeBean(deleteId, null, null, 0);
				rowsAffected = dao.deleteEmployee(ebean);

				if (rowsAffected > 0)
				{
					System.out.println("Employee Record Deleted Successfully");
				} else
				{
					System.out.println("Employee Record not Deleted or not founded");
				}
				break;

			case 4:
				ArrayList<EmployeeBean> list = dao.getAllEmployees();

				System.out.println("\n--> Using ArrayList");
				System.out.println("EMPLOYEE_ID\tFIRST_NAME\tLAST_NAME\tSALARY");
				System.out.println("-----------\t----------\t---------\t------");
				for (int i = 0; i < list.size(); i++)
				{
					ebean = list.get(i);
					System.out.println(ebean.getEmpId() + "\t\t" + ebean.getFirstName() + "\t\t" + ebean.getLastName()
							+ "\t\t" + ebean.getSalary());
				}

				break;

			case 5:
				try
				{
					System.out.println("--------------------------- Exit ---------------------------");
					System.exit(0);
					Thread.sleep(500);
				} catch (InterruptedException e)
				{
					e.printStackTrace();
				}
				break;

			default:
				System.out.println("Invalid choice. Please choose a valid option.");
			}
		}

	}
}
