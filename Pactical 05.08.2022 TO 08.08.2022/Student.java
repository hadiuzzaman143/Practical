import java.io.Serializable;
// Serialization : writing state of an object into byte stream

public class Student implements Serializable
{  
   // parent class
	int id;
	String name;
	int fees;  // use this data member of class in order to avoid serialization
	
	public Student(int id,String name,int fees) 
  {   
    // parameterized constructor
		this.id = id;
		this.name = name;
		this.fees = fees;
	}
}
