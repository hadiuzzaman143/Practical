import java.util.InputMismatchException;
import java.util.Scanner;

public class NestedCatch 
{   
	// class
	public static void main(String[] args) 
	{   
		// main method
		Scanner s = new Scanner(System.in);    // scanner object
		System.out.println("Enter values: ");
		
		// try block 
		try {
			int x = s.nextInt();
			int y = s.nextInt();
			System.out.println(" "+ (x/y));
		}
		
		// input mismatch exception
		catch (InputMismatchException e) 
		{     
			// nested catch
			System.out.println("java.utill.InputMismatchException");
		}
		catch (Exception e) 
		{
			System.out.println(e);
		}
	}
	
}
