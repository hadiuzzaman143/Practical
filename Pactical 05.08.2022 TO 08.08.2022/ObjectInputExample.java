import java.io.FileInputStream;
import java.io.ObjectInputStream;
public class ObjectInputExample 
{
     // main class
    public static void main(String[]args)
    {
        try{
            // create a object of ObjectInputStream to read the data type
            ObjectInputStream obj2 = new ObjectInputStream(new FileInputStream("F:\\text2"));
            // object of Student.java parent class
            Student s = (Student)obj2.readObject();
            
            System.out.println(" id is: "+ s.id + " name is: "+ s.name +" fees is: "+ s.fees);
            
            obj2.close();
        }
        catch(Exception e)
        {
         System.out.println(e);
        }
    }       
}
