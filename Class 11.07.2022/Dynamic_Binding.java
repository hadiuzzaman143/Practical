public class Dynamic_Binding 
{
    void eat()
{
    System.out.println("Cow is eating");
}  
}  
  
class Cat extends Animal
{  
 void eat()
 {
    System.out.println("Cat is eating");
 }  
  
 public static void main(String args[])
 {  
  Animal a=new Cat();  
  a.eat();  
 }  
}