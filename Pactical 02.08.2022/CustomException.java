import java.util.Scanner;

class InvalidAgeException extends Exception 
{   
	// class for custom exception

}

public class CustomException 
{    
	// class
	// method to check whether the student is pass or not
	public void check(int age) throws InvalidAgeException
	{   
		if (age<=18 || age>=25) 
		{   // condition declare
			// throw custom exception 
			throw new InvalidAgeException();
		}
		else {
			System.out.println("Proper age for enrolling java course");
		}
	}
	
	public static void main(String[] args) throws InvalidAgeException 
	{
		CustomException temp = new CustomException();    // object
		var s = new Scanner (System.in);    // scanner object
		System.out.println("Enter age: ");
		int age = s.nextInt();   // read the input
		temp.check(age);    // called the method
		System.out.println("rest of the code... ");
	}
} 
