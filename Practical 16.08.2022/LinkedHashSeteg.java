import java.util.Iterator;
import java.util.LinkedHashSet;

public class LinkedHashSeteg
{    
    // main class
	public static void main(String[] args) 
    {     
        // main method
		// create a LinkedHashSet and adding elements
		LinkedHashSet<String> link = new LinkedHashSet<>();
		link.add("one");
		link.add("two");
		link.add("three");
		link.add("four");
		link.add("five");
		link.add(null);
		
		
		// it will print false because this element not exist
		System.out.println(link.remove("six"));
		
		// using iterator to inverse all elements
		Iterator<String> i = link.iterator();
		while(i.hasNext()) 
        {
			System.out.println(i.next());
		}
	}
}