// How to create Immutable class?
// There are many immutable classes like String, Boolean, Byte, Short, Integer, Long, Float, Double etc. 
// In short, all the wrapper classes and String class is immutable. 
// We can also create immutable class by creating final class that have final data members as the example given below:

package String_Manupulation.immutable.createImmutableClass;

public final class Person {
	private final String name;
	private final int age;

	// Constructor
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}

	// Getter methods
	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	// Main method for testing
	public static void main(String[] args) {
		Person person = new Person("John", 25);
		System.out.println("Name: " + person.getName());
		System.out.println("Age: " + person.getAge());
	}
}

/*
 
The above class is immutable because:
	◦  The instance variable of the class is final i.e. we cannot change the value of it after creating an object.
	◦  The class is final so we cannot create the subclass.
	◦  There is no setter methods i.e. we have no option to change the value of the instance variable.
	
 */

