package jdbc.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Scanner;

import jdbc.bean.StudentBean;
import jdbc.util.DBConnection;

// StudentDao --> Students Table
public class StudentDao
{

	/* insert SQL Querry --> Student */
	// public int insertStudent(String name, String std, int marks) // without
	// StudentBean
	public int insertStudent(StudentBean sbean) // with StudentBean
	{
		int rowsAffected = 0;
		// String insertQuery = "INSERT INTO STUDENTS(NAME, STD, MARKS) VALUES('" + name
		// + "','" + std + "'," + marks + ")"; // without StudentBean
		String insertQuery = "INSERT INTO STUDENTS(NAME, STD, MARKS) VALUES('" + sbean.getName() + "','" + sbean.getStd() + "'," + sbean.getMarks() + ")"; // with StudentBean
		System.out.println("insertQuery : " + insertQuery);

		// 1) Database Connection Object
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
			System.out.println("StudentDao insertStudent() :: DB not connected");
		}

		// 5) return rowsAffected
		return rowsAffected;
	}

	/* update SQL Querry --> Student */
//	public int updateStudent(int rno, String name, String std, int marks) // without StudentBean
	public int updateStudent(StudentBean sbean) // with StudentBean
	{
		int rowsAffected = 0;

//		String updateQuery = "UPDATE STUDENTS SET NAME = '" + name + "', STD = '" + std + "', MARKS = " + marks + " WHERE RNO = " + rno + ""; // without StudentBean
		String updateQuery = "UPDATE STUDENTS SET NAME = '" + sbean.getName() + "', STD = '" + sbean.getStd() + "', MARKS = " + sbean.getMarks() + " WHERE RNO = " + sbean.getRno() + ""; // with
																																															// StudentBean

		System.out.println("updateQuery : " + updateQuery);

		// 1) Database Connection object
		Connection conn = DBConnection.getConnection();

		// 2) validate Connection object
		if (conn != null)
		{
			try
			{
				// 3) create stmt object
				Statement stmt = conn.createStatement();

				// 4) execute sql update query and store rowsAffected
				rowsAffected = stmt.executeUpdate(updateQuery);

			} catch (SQLException e)
			{
				e.printStackTrace();
			}
		} else
		{
			System.out.println("StudentDao updateStudent() :: DB not connected");
		}

		// 5) return rowsAffected
		return rowsAffected;
	}

	/* delete SQL Querry --> Student */
	// public int deleteStudent(int rno) // without StudentBean
	public int deleteStudent(StudentBean sbean) // with StudentBean
	{
		int rowsAffected = 0;

		// String deleteQuery = "DELETE FROM STUDENTS WHERE RNO = " + rno + ""; //
		// without StudentBean
		String deleteQuery = "DELETE FROM STUDENTS WHERE RNO = " + sbean.getRno() + ""; // with StudentBean
		System.out.println("deleteQuery : " + deleteQuery);

		// 1) Database Connection Object
		Connection conn = DBConnection.getConnection();

		// 2) Validate Connection Object
		if (conn != null)
		{
			try
			{
				// 3) Create stmt object
				Statement stmt = conn.createStatement();

				// 4) execute sql delete query and store in rowsAffected
				rowsAffected = stmt.executeUpdate(deleteQuery);

			} catch (SQLException e)
			{
				e.printStackTrace();
			}
		} else
		{
			System.out.println("StudentDao deleteQuery() :: DB not connected");
		}

		return rowsAffected;
	}

	/* display SQL Querry --> Student */
	public ArrayList<StudentBean> getAllStudents()
	{
		ArrayList<StudentBean> list = new ArrayList<StudentBean>();
//		StudentBean sbean = null;

		String selectQuery = "SELECT * FROM STUDENTS";
		System.out.println("selectQuery : " + selectQuery);

		// 1) Database Connection Object
		Connection conn = DBConnection.getConnection();

		// 2) Validate Connection Object
		if (conn != null)
		{
			try
			{
				// 3) create stmt object
				Statement stmt = conn.createStatement();

				// 4) execute select query
				ResultSet result = stmt.executeQuery(selectQuery);

				System.out.println("\n--> using ResultSet");
				System.out.println("RNO\tNAME\tSTD\tMARKS");
				System.out.println("---\t----\t---\t-----");
				while (result.next())
				{
					int rno = result.getInt("RNO");
					String name = result.getString("NAME");
					String std = result.getString("STD");
					int marks = result.getInt("MARKS");

					System.out.println(rno + "\t" + name + "\t" + std + "\t" + marks);

					// Add StudentBean Record into ArrayList
					StudentBean sbean = new StudentBean(rno, name, std, marks);
					list.add(sbean);
				}
			} catch (SQLException e)
			{
				e.printStackTrace();
			}
		} else
		{
			System.out.println("StudentDao getAllStudents() :: DB not connected");
		}

		return list;
	}

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);

		StudentDao dao = new StudentDao();
		StudentBean sbean = null;

		String name, std;
		int rno, marks;
		int rowsAffected = 0;

		while (true)
		{
			System.out.println("============================================================");
			System.out.println("                    Student JDBC");
			System.out.println("============================================================");
			System.out.println("1. Insert Student");
			System.out.println("2. Update Student");
			System.out.println("3. Delete Student");
			System.out.println("4. Display Student");
			System.out.println("5. Exit");
			System.out.println("============================================================");

			System.out.println("Enter choice : ");
			int choice = sc.nextInt();

			switch (choice)
			{
			case 1:
				sc.nextLine();
				System.out.println("Enter Name : ");
				name = sc.nextLine();
				System.out.println("Enter Std : ");
				std = sc.nextLine();
				System.out.println("Enter Marks : ");
				marks = sc.nextInt();

//				rowsAffected = dao.insertStudent(name, std, marks); // without StudentBean

				sbean = new StudentBean(0, name, std, marks); // with StudentBean
				rowsAffected = dao.insertStudent(sbean); // with StudentBean

				if (rowsAffected > 0)
				{
					System.out.println("Student Record Succesfully Inserted");
				} else
				{
					System.out.println("Student Record not Inserted");
				}
				break;

			case 2:
				System.out.println("Enter Rno : ");
				rno = sc.nextInt();
				sc.nextLine();
				System.out.println("Enter Name : ");
				name = sc.nextLine();
				System.out.println("Enter Std : ");
				std = sc.nextLine();
				System.out.println("Enter Marks : ");
				marks = sc.nextInt();

//				rowsAffected = dao.updateStudent(rno, name, std, marks); // without StudentBean

				sbean = new StudentBean(rno, name, std, marks); // with StudentBean
				rowsAffected = dao.updateStudent(sbean); // with StudentBean

				if (rowsAffected > 0)
				{
					System.out.println("Student Record Successfully Updated");
				} else
				{
					System.out.println("Student Record not Updated Or not Founded");
				}
				break;

			case 3:
				System.out.println("Enter Rno u want to Delete : ");
				int deleteRno = sc.nextInt();

//				rowsAffected = dao.deleteStudent(deleteRno); // without StudentBean

				sbean = new StudentBean(deleteRno, null, null, 0); // with StudentBean
				rowsAffected = dao.deleteStudent(sbean); // with StudentBean

				if (rowsAffected > 0)
				{
					System.out.println("Student Record Successfully deleted");
				} else
				{
					System.out.println("Student Record not deleted Or not Founded");
				}
				break;

			case 4:
				ArrayList<StudentBean> list = dao.getAllStudents();

				System.out.println("\n--> using ArrayList");
				System.out.println("RNO\tNAME\tSTD\tMARKS");
				System.out.println("---\t----\t---\t-----");
				for (int i = 0; i < list.size(); i++)
				{
					StudentBean s = list.get(i);
					System.out.println(s.getRno() + "\t" + s.getName() + "\t" + s.getStd() + "\t" + s.getMarks());
				}
				break;

			case 5:
				try
				{
					System.out.println("---------------------------- EXit ----------------------------");
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
