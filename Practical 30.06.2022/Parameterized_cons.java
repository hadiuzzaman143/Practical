public class Parameterized_cons
{
    String name;     // variable type
	Parameterized_cons(String name1) // parameterized constructor
    {   
		name = name1;
		System.out.println("Cons Called");
		
	}
	public static void main(String[] args) 
    {   //  main method
		Parameterized_cons obj = new Parameterized_cons("Java");    // object 1
		Parameterized_cons obj1 = new Parameterized_cons("C++");    // object 2
		Parameterized_cons obj2 = new Parameterized_cons("C");      // object 3
		System.out.println("This name is " + obj.name);
		System.out.println("This name is " + obj1.name);
		System.out.println("This name is " + obj2.name);
	}    
}
