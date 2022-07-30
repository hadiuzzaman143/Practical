import java.util.Scanner;

public class StringEquality 
{   // class
	public static void main(String[] args) {    // main method
		String str1, str2;
		Scanner sb = new Scanner(System.in);    // scanner object
		
		System.out.println("Enter first String: ");
		str1 = sb.nextLine();   // read the input
		
		System.out.println("Enter second String: ");
		str2 = sb.nextLine();   // read the input
		
		if (str1.equals(str2)) 
    {    // condition
			System.out.println("Equal Strings.");
		}
		else {
			System.out.println("Unequal Strings.");
		}
	}
}
