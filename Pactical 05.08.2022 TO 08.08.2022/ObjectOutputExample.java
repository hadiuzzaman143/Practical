import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class ObjectOutputExample 
{
    // main class
public static void main(String[]args)
{
    try{
        // object of Student.java parent class
        Student s = new Student(101, "Hadiuz", 2000);
        // create a FileOutputStream with file path
        FileOutputStream obj =new FileOutputStream("F:\\text2");
        // create a object of ObjectOutputStream to write the data type
        ObjectOutputStream obj2 = new ObjectOutputStream(obj);
        obj2.writeObject(s); // object to specify ObjectOutputStream class
        obj2.close();
        System.out.println("Done");
    }
    // catch block with exception
    catch(Exception e)
    {
     System.out.println(e);
    }
}    
}
