package Exception_Handling.Java_throw_keyword_6;

// class represents user-defined exception  
class UserDefinedException extends Exception {

	public UserDefinedException(String str) {
		// Calling constructor of parent Exception
		super(str);
	}

}

// Class that uses above MyException  
public class TestThrow3 {
	public static void main(String args[]) {

		try {

			// throw an object of user defined exception
			throw new UserDefinedException("This is user-defined exception");

		} catch (UserDefinedException e) {

			System.out.println("Caught the exception");
			// Print the message from MyException object
			System.out.println(e.getMessage());

		}

	}
}
