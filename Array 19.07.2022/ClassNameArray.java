public class ClassNameArray 
{
 public static void main(String[]args)
 {
    int arr[]={1,2,3};
    Class c = arr.getClass(); 
    String name= c.getName();
    System.out.println(name); //print the class name
 }   
}
