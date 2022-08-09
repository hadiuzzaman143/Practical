 
import java.io.ByteArrayOutputStream;  
import java.io.FileOutputStream;
import java.io.IOException;

public class ByteArrayOutputStreamEg 
{   
	// main class
	public static void main(String[] args) throws IOException 
	{   
		// main method throws IO 
		// Create FileOutputStream objects with file path
		FileOutputStream obj1 = new FileOutputStream("F:\\text");
		FileOutputStream obj2 = new FileOutputStream("F:\\text1");
		
		// create ByteArrayOutputStream object
		ByteArrayOutputStream temp = new ByteArrayOutputStream();
		temp.write(65);   // declare the byte code input
		temp.writeTo(obj1);   // object to convert byte code
		temp.writeTo(obj2);   // object to convert byte code
		temp.close();   // close the object
		System.out.println("Done.");
	}
}