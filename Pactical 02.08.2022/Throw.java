public class Throw 
{  
	 // class
	public static void myDisplay(int a)    // method
	// throw arithmetic exception to check pass or not
	throws ArithmeticException 
	{
		if (a>=0 && a<=35) 
		{
			throw new ArithmeticException("Value can not be less than 35");
		}
		else 
		{
		  System.out.println("You are pass");
		}
	}
	public static void main(String[] args) 
	{   
		 // main method
		myDisplay(30);   // predefined value
	}
}
