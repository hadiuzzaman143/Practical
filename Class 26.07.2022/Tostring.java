public class Tostring 
{
 int rollno;
 String name,addr;
 Tostring(int rollno,String name,String addr) 
 {
    this.rollno=rollno;
    this.name = name;
    this.addr=addr;
 }   
 public String toString()
 {
    return super.toString();
 }
 public static void main (String[]args)
 {
    Tostring s1 =new Tostring(1,"ram", "Munbai");
    Tostring s2 = new Tostring(2,"Karan","Dilhi");
    System.out.println(s1);
    System.out.println(s2);
 }
}
