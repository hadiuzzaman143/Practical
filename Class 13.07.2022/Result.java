import java.util.Scanner;
public class Result 
{
	public static void main(String[] args) 
	{
		Scanner temp = new Scanner(System.in);
		String stdName;
		int stdPass,stdId;
		double sub1,sub2,sub3,sub4,sub5;
		
		System.out.println("Enter name: ");
		stdName = temp.nextLine();
		
		System.out.println("Enter passwprd: ");
		stdPass = temp.nextInt();
		
		System.out.println("Enter usr id: ");
		stdId = temp.nextInt();
		
		
		System.out.println("Enter marks of Subject 1: ");
		sub1 = temp.nextFloat();
		System.out.println("Enter marks of Subject 2: ");
		sub2 = temp.nextFloat();
		System.out.println("Enter marks of Subject 3: ");
		sub3 = temp.nextFloat();
		System.out.println("Enter marks of Subject 4: ");
		sub4 = temp.nextFloat();
		System.out.println("Enter marks of Subject 5: ");
		sub5 = temp.nextFloat();
		
		
		Student_details obj = new Student_details();
		
		obj.setName(stdName);
		obj.setId(stdId);
		obj.setPw(stdPass);
		
		System.out.println("Name: "+obj.getName());
		System.out.println("User ID: "+obj.getId());
		System.out.println("Password: "+obj.getPw());
		obj.Cal(sub1,sub2,sub3,sub4,sub5);
		
	}

}
class Student_details
{
	private String name;
	private int id;
	private int password;
	double total, percentage;
	
	public String getName() 
	{   // getter method
		return name;
	}
	public void setName(String name) 
	{    // setter method
		this.name = name;
	}
	
	public int getId() 
	{   // getter method
		return id;
	}
	public void setId(int id) 
	{    // setter method
		this.id = id;
	}
	
	public int getPw() 
	{   // getter method
		return password;
	}
	public void setPw(int password) 
	{  // setter method  
		this.password = password;
	}
	
	public void Cal(double sub1,double sub2,double sub3, double sub4,double sub5) 
	{
		total =  sub1+sub2+sub3+sub4+sub5;
	}
	public void Cal2(double percentage) 
	{
		
		percentage = (total / 500.0) * 100;
	}
	
}