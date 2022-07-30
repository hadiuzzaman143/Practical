public class SubString 
{   // class
	public static void main(String[] args) 
    {   
        // main method
		String str = "Anudip Foundation, Skill and Career Development";   // string value
		
		String new_str = str.substring(7,24);   // substring object with index value
		
		System.out.println("old: "+str);
		System.out.println("new: "+new_str);
	}
}
