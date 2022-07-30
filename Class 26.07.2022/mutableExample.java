 // Manipulate string mutability

public class mutableExample 
{    // class
	
	public static void show() 
	{    // method
		StringBuffer s = new StringBuffer("Hello");     // string buffer object
		s.append("World");    // called append method
		System.out.println("append: "+s);
		
		s.insert(2, "Hadiuz");    // called insert method
		System.out.println("insert: "+s);
		
		s.replace(1, 3, "java");    // called replace method
		System.out.println("replace: "+s);
		
		StringBuilder s1 = new StringBuilder("world");    // string builder object
		s1.replace(1, 3, "java");    // called replace method
		System.out.println("replace: "+s1);
		
		s1.delete(1, 3);    // called delete method
		System.out.println("delete: "+s1);
		
		s1.reverse();    // called reverse method
		System.out.println("reverse: "+s1);
	}
	public static void main(String[] args) 
	{    // main method
		show();    // called the method
	}

}
