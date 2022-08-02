public class ExceptionEg 
{   
    // class
	public void show() 
    {   
        // method
		String a = "i am error!";
		System.out.println(a);
		try {
			int i = 50/0;           // Arithmetic exception
			System.out.println(i);
			
			int arr[] = new int[3];  // Array index out of bound exception
			arr[4] = 24;
		}
		// multiple catch block
		catch (ArithmeticException e) 
        {
			System.out.println(e);
		}
		catch (ArrayIndexOutOfBoundsException e) 
        {
			System.out.println(e);
		}
	}
	public static void main(String[] args) 
    {   
        // main method
		ExceptionEg temp = new ExceptionEg();
		temp.show();   // called method
	}
}
