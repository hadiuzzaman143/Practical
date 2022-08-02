public class NestedCatchEg 
{   // class 
	public static void main(String[] args) 
    {   
        // main method 
		// Outer Try block
		try {
			// inner try block 1
			try {
				System.out.println("Going to divide by 0");
				int b = 19/0;
			}
			// catch block of inner try block 1
			catch (ArithmeticException e) 
            {
				System.out.println(e);
			}
			// inner try block 2
			try {
				int a[] = new int[5];
				
				a[6] = 4;   // value of array bound
			}
			// catch block of inner try block 2
			catch (ArrayIndexOutOfBoundsException e) 
            {
				System.out.println(e);
			}
			System.out.println("other statement");
			
		}
		// Outer Catch block
		catch (Exception e) 
        {
			System.out.println("handled the exception (outer catch)");
		}
		
		System.out.println("normal flow");
	}

}