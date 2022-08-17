import java.util.HashMap;
import java.util.Map;

public class HashMapEg 
{    
    // main class
	public static void main(String[] args) 
    {    
		// created a HashMap object and adding elements
		HashMap<Integer, String> map = new HashMap<>();
		map.put(101, "mango");
		map.put(108, "orange");
		map.put(105, "banana");
		map.put(103, "grapes");
		map.put(105, "banana");
		map.put(null, null);
		map.put(102, null);
		map.put(null, "apple");
		// if the element is not there this will add it.
		map.putIfAbsent(102, "Custard Apple");
		map.putIfAbsent(101, "WaterMelon");
		
		// traversing
		for (Map.Entry m : map.entrySet()) 
        {
			System.out.println(m.getKey()+" "+m.getValue());
		}
		// removing the element
		map.remove(103);
		System.out.println(map);
	}
}