class Animal
{  
    void eat()
    {
        System.out.println("Cow eating");
    }  
    }  
    class Cow extends Animal
    {  
    void eat()
    {
        System.out.println("Cow eating fruits");
    }  
    }  
    class BabyCow extends Cow
    {  
    void eat()
    {
        System.out.println("Cow drinking Water");
    }  
    public static void main(String args[])
    {  
    Animal a,b,c;  
    a=new Animal();  
    b=new Cow();  
    c=new BabyCow();  
    a.eat();  
    b.eat();  
    c.eat();  
    }  
}  