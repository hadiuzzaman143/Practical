public class ThrowEg 
{   
    // class
	public static void Eligible(int age) 
    {   
         // method
		if (age<18) 
        {    
            // condition
			// throw arithmetic exception to check eligibility 
			throw new ArithmeticException("Person is not eligible to vote");
		}
		else {
			System.out.println("person is eligible for vote");
		}
	}
	public static void main(String[] args) 
    {   
        // main method
		Eligible(13);    // predefined value
		System.out.println("rest of the code....");
	}
}
