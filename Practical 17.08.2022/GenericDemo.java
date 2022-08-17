import java.util.HashMap;
import java.util.Map;
// generic
public class GenericDemo 
{      
    // main class
	public static void main(String[] args) 
    {   
         // main method
		// created a HashMap object 
		Map<Integer,String> mp = new HashMap<>();
		// adding elements
		mp.put(1, "pallabi");
		mp.put(2, "rahul");
		mp.put(5, "sweta");
		mp.put(7, "karan");
		
		// traversing elements
		for(Map.Entry en : mp.entrySet()) 
        {
			// print key and value from elements
			System.out.println(en.getKey() + " " + en.getValue());
		}
	}
}