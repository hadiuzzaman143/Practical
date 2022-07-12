
public class Data_Member
{
 int CarSpeed = 80;   
}
class CarName extends Data_Member
{
 int CarSpeed = 90;
 public static void main(String[]args)
 {
  CarName obj= new CarName();
  System.out.println(obj.CarSpeed);
 }
} 
