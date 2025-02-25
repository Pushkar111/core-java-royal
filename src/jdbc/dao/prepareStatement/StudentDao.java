package jdbc.dao.prepareStatement;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Scanner;

import jdbc.bean.StudentBean;
import jdbc.util.DBConnection;

public class StudentDao
{

	public int insertStudent(StudentBean sbean)
	{
		int rowsAffected = 0;

		String insertQuery = "INSERT INTO STUDENTS (NAME, STD, MARKS) VALUES (?, ?, ?)";
		System.out.println("insertQuery : " + insertQuery);

		Connection conn = DBConnection.getConnection();

		if (conn != null)
		{
			try
			{
				PreparedStatement pstmt = conn.prepareStatement(insertQuery);

				pstmt.setString(1, sbean.getName());
				pstmt.setString(2, sbean.getStd());
				pstmt.setInt(3, sbean.getMarks());

				rowsAffected = pstmt.executeUpdate();

			} catch (SQLException e)
			{
				e.printStackTrace();
			}
		} else
		{
			System.out.println("prepareStatement : StudentDao insertStudent() :: DB not connected");
		}

		return rowsAffected;
	}

	public int updateStudent(StudentBean sbean)
	{
		int rowsAffected = 0;

		String updateQuery = "UPDATE STUDENTS SET NAME = ?, STD = ?, MARKS = ? WHERE RNO = ?";
		System.out.println("updateQuery : " + updateQuery);

		Connection conn = DBConnection.getConnection();
		if (conn != null)
		{
			try
			{
				PreparedStatement pstmt = conn.prepareStatement(updateQuery);

				pstmt.setString(1, sbean.getName());
				pstmt.setString(2, sbean.getStd());
				pstmt.setInt(3, sbean.getMarks());
				pstmt.setInt(4, sbean.getRno());

				rowsAffected = pstmt.executeUpdate();

			} catch (SQLException e)
			{
				e.printStackTrace();
			}
		} else
		{
			System.out.println("prepareStatement : StudentDao updateStudent() :: DB not connected");
		}

		return rowsAffected;
	}

	public int deleteStudent(StudentBean sbean)
	{
		int rowsAffected = 0;

		String deleteQuery = "DELETE FROM STUDENTS WHERE RNO = ?";
		System.out.println("deleteQuery : " + deleteQuery);

		Connection conn = DBConnection.getConnection();

		if (conn != null)
		{
			try
			{
				PreparedStatement pstmt = conn.prepareStatement(deleteQuery);

				pstmt.setInt(1, sbean.getRno());

				rowsAffected = pstmt.executeUpdate();

			} catch (SQLException e)
			{
				e.printStackTrace();
			}
		} else
		{
			System.out.println("prepareStatement : StudentDao deleteStudent() :: DB not connected");
		}

		return rowsAffected;
	}

	public ArrayList<StudentBean> getAllStudents()
	{
		ArrayList<StudentBean> list = new ArrayList<StudentBean>();
		StudentBean sbean = null;

		String selectQuery = "SELECT * FROM STUDENTS";
		System.out.println("selectQuery : " + selectQuery);

		Connection conn = DBConnection.getConnection();

		if (conn != null)
		{
			try
			{
				PreparedStatement pstmt = conn.prepareStatement(selectQuery);

				ResultSet result = pstmt.executeQuery();

				System.out.println("\n--> Using ResultSet");
				System.out.println("RNO\tNAME\tSTD\tMARKS");
				System.out.println("---\t----\t---\t-----");
				while (result.next())
				{
					int rno = result.getInt(1);
					String name = result.getString(2);
					String std = result.getString(3);
					int marks = result.getInt(4);
					System.out.println(rno + "\t" + name + "\t" + std + "\t" + marks);

					sbean = new StudentBean(rno, name, std, marks);
					list.add(sbean);
				}

			} catch (SQLException e)
			{
				e.printStackTrace();
			}
		} else
		{
			System.out.println("prepareStatement : StudentDao getAllStudents() :: DB not connected");
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

			System.out.println("Enter the choice : ");
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

				sbean = new StudentBean(0, name, std, marks);
				rowsAffected = dao.insertStudent(sbean);

				if (rowsAffected > 0)
				{
					System.out.println("Student Record Succesfully Inserted");
				} else
				{
					System.out.println("Student Record not Inserted or not founded");
				}
				break;

			case 2:
				System.out.println("Enter Rno u want to Update");
				rno = sc.nextInt();
				sc.nextLine();
				System.out.println("Enter Name : ");
				name = sc.nextLine();
				System.out.println("Enter Std : ");
				std = sc.nextLine();
				System.out.println("Enter Marks : ");
				marks = sc.nextInt();

				sbean = new StudentBean(rno, name, std, marks);
				rowsAffected = dao.updateStudent(sbean);

				if (rowsAffected > 0)
				{
					System.out.println("Student Record Succesfully Updated");
				} else
				{
					System.out.println("Student Record not Updated or not founded");
				}
				break;

			case 3:
				System.out.println("Enter Rno u want to Delete : ");
				int deleteRno = sc.nextInt();

				sbean = new StudentBean(deleteRno, null, null, 0);
				rowsAffected = dao.deleteStudent(sbean);

				if (rowsAffected > 0)
				{
					System.out.println("Student Record Succesfully Deleted");
				} else
				{
					System.out.println("Student Record not Deleted or not founded");
				}
				break;

			case 4:
				ArrayList<StudentBean> list = dao.getAllStudents();

				System.out.println("\n--> using ArrayList");
				System.out.println("RNO\tNAME\tSTD\tMARKS");
				System.out.println("---\t----\t---\t-----");
				for (int i = 0; i < list.size(); i++)
				{
					sbean = list.get(i);
					System.out.println(
							sbean.getRno() + "\t" + sbean.getName() + "\t" + sbean.getStd() + "\t" + sbean.getMarks());
				}
				break;

			case 5:
				System.out.println(
						"--------------------------------------- Application Exit ---------------------------------------");
				try
				{
					Thread.sleep(500);
				} catch (InterruptedException e)
				{
					e.printStackTrace();
				}
				System.exit(0);
				break;
			}
		}
	}
}
