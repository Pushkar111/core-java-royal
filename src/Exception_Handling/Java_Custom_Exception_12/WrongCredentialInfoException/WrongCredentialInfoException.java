package Exception_Handling.Java_Custom_Exception_12.WrongCredentialInfoException;

public class WrongCredentialInfoException extends Exception
{
	// make customExecption Class Constructor
	// Constructor Chaining call parent Exeption Class Constructor
	public WrongCredentialInfoException(String ExceptionMsg)
	{

		// super is used to invoked immidiate parent class constructor
		super(ExceptionMsg);
	}
}
