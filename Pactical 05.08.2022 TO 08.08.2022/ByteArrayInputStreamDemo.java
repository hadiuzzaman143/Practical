 import java.io.ByteArrayInputStream;

public class ByteArrayInputStreamDemo 
{   
  // main class
	public static void main(String[] args) 
  {    
    // main method
		byte [] arr = {65,37,70,39,81};    // array of byte data type
		
		// create ByteArrayInputStream object
		ByteArrayInputStream obj = new ByteArrayInputStream(arr);
		int i = 0;
		while ((i=obj.read()) != - 1) 
    {    
      // using loop to read all the elements
			char ch = ((char)i);    // create a char object
			System.out.println("ASCII Character "+ i + ", Value is "+ch);
		}
	}
}