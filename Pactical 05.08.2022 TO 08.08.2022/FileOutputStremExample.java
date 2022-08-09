import java.io.FileOutputStream;

public class FileOutputStremExample 
{
 public static void main(String[]args)
 {
    try{
        FileOutputStream obj =new FileOutputStream("F:\\text");
         obj.write(2);
        String s = "Adi ";
        byte b []=s.getBytes();

        obj.write(b);
        obj.close();
        System.out.println("Done");
    }
    catch(Exception e)
    {
        System.out.println(e);
    }
 }    
}
