import java.io.FileInputStream;
public class FileInputStreamExample 
{
  public static void main(String[]args)
  {
    try{
        FileInputStream obj = new FileInputStream("F:\\text");
        int i = obj.read();
        System.out.println(((char)i));
        int j = 0;
        while ((j=obj.read()) !=-1)
        {
            System.out.println(((char)j));
        }
        obj.close();
    }
    catch (Exception e)
    {
        System.out.println(e);
    }
  }  
}
