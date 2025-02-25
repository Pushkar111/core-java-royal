package jdbc.dao.prepareStatement;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Scanner;

import jdbc.bean.EmployeeBean;
import jdbc.util.DBConnection;

public class EmployeeDao
{
	public int insertEmployee(EmployeeBean ebean)
	{
		int rowsAffected = 0;

		String insertQuery = "INSERT  INTO EMPLOYEES (FIRST_NAME, LAST_NAME, SALARY) VALUES (?, ?, ?)";
		System.out.println("insertQuery : " + insertQuery);

		Connection conn = DBConnection.getConnection();

		if (conn != null)
		{
			try
			{
				PreparedStatement pstmt = conn.prepareStatement(insertQuery);

				pstmt.setString(1, ebean.getFirstName());
				pstmt.setString(2, ebean.getLastName());
				pstmt.setInt(3, ebean.getSalary());

				rowsAffected = pstmt.executeUpdate();

			} catch (SQLException e)
			{
				e.printStackTrace();
			}
		} else
		{
			System.out.println("prepareStatement : EmployeeDao insertEmployee() :: DB not Connected");
		}
		return rowsAffected;
	}

	public int updateEmployee(EmployeeBean ebean)
	{
		int rowsAffected = 0;
		String updateQuery = "UPDATE EMPLOYEES SET FIRST_NAME = ?, LAST_NAME = ?, SALARY = ? WHERE EMPLOYEE_ID = ?";
		System.out.println("updateQuery : " + updateQuery);

		Connection conn = DBConnection.getConnection();

		if (conn != null)
		{
			try
			{
				PreparedStatement pstmt = conn.prepareStatement(updateQuery);

				pstmt.setString(1, ebean.getFirstName());
				pstmt.setString(2, ebean.getLastName());
				pstmt.setInt(3, ebean.getSalary());
				pstmt.setInt(4, ebean.getEmpId());

				rowsAffected = pstmt.executeUpdate();

			} catch (SQLException e)
			{
				e.printStackTrace();
			}
		} else
		{
			System.out.println("prepareStatement : EmployeeDao updateEmployee() :: DB not Connected");
		}
		return rowsAffected;
	}

	public int deleteEmployee(EmployeeBean ebean)
	{
		int rowsAffected = 0;

		String deleteQuery = "DELETE FROM EMPLOYEES WHERE EMPLOYEE_ID = ?";
		System.out.println("deleteQuery : " + deleteQuery);

		Connection conn = DBConnection.getConnection();

		if (conn != null)
		{
			try
			{
				PreparedStatement pstmt = conn.prepareStatement(deleteQuery);

				pstmt.setInt(1, ebean.getEmpId());

				rowsAffected = pstmt.executeUpdate();

			} catch (SQLException e)
			{
				e.printStackTrace();
			}
		} else
		{
			System.out.println("prepareStatement : EmployeeDao deleteEmployee() :: DB not Connected");
		}

		return rowsAffected;
	}

	public ArrayList<EmployeeBean> getAllEmployees()
	{
		ArrayList<EmployeeBean> list = new ArrayList<EmployeeBean>();

		String selectQuery = "SELECT * FROM EMPLOYEES";
		System.out.println("selectQuery : " + selectQuery);

		Connection conn = DBConnection.getConnection();
		if (conn != null)
		{
			try
			{
				PreparedStatement pstmt = conn.prepareStatement(selectQuery);

				ResultSet result = pstmt.executeQuery();

				System.out.println("\n--> Using ResultSet");
				System.out.println("EMPLOYEE_ID\tFIRST_NAME\tLAST_NMAE\tSALARY");
				System.out.println("-----------\t----------\t---------\t------");
				while (result.next())
				{
					int empId = result.getInt(1);
					String firstName = result.getString(2);
					String lastName = result.getString(3);
					int salary = result.getInt(4);

					System.out.println(empId + "\t\t" + firstName + "\t\t" + lastName + "\t\t" + salary);

					EmployeeBean ebean = new EmployeeBean(empId, firstName, lastName, salary);
					list.add(ebean);
				}
			} catch (SQLException e)
			{
				e.printStackTrace();
			}
		} else
		{
			System.out.println("prepareStatement : EmployeeDao getAllEmployees() :: DB not Connected");
		}

		return list;
	}

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);

		EmployeeDao dao = new EmployeeDao();
		EmployeeBean ebean = null;

		int empId, salary;
		String firstName, lastName;
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
