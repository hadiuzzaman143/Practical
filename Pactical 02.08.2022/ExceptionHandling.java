public class ExceptionHandling 
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
			
			String s = "riya";
			System.out.println(s.length());
			int arr[] = new int[3];
			arr[4] = 24;           // Array index out of bound exception
			
			int m = Integer.parseInt(s);    // number format exception
			System.out.println(m);
			
		}
		catch(Exception e) 
		{
			System.out.println(e);
		}
		String b = " i can not be handle.";
		System.out.println(a + b);
	}
	public static void main(String[] args) 
	{    // main method
		ExceptionHandling x = new ExceptionHandling();
		x.show();    // called method
	} 
}