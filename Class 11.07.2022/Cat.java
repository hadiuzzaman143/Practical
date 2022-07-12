 // Static Binding
public class Cat
{
    private void eat()
    {
        System.out.println("Cat is eting");
    }  
  
    public static void main(String args[])
    {  
     Cat a =new Cat();  
     a.eat();  
    }      
}
