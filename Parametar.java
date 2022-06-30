import java.util.Scanner;

public class Parametar
{
   public static void main(String[] args)
   {
      Scanner s1 = new Scanner(System.in);
      
      System.out.print("Enter the Side Length of Square: ");
      float c = s1.nextFloat();
      
      float a = c*c;
      float b = 4*c;
      System.out.println("\nArea = " +a);
      System.out.println("\nPerimeter = " +b);
        
    }

}
