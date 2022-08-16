import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetDemo 
{     
    // main class
	public static void main(String[] args) 
    {    
        // main method
		// create TreeSet object and adding elements
		TreeSet<String> tree = new TreeSet<>();
		tree.add("ball");
		tree.add("cat");
		tree.add("apple");
//		tree.add(null);   // TreeSet doesn't allow null value
		tree.add("dog");
		
		// traversing the elements
		Iterator<String> i = tree.iterator();
		while(i.hasNext()) 
        {
			System.out.println(i.next());
		}
		
		System.out.println("---------");
		
		// traversing the elements in descending order
		Iterator<String> id = tree.descendingIterator();
		while(id.hasNext()) 
        {
			System.out.println(id.next());
		}
		
		System.out.println("---------");
		
		// create a new TreeSet object and adding new elements
		TreeSet<String> set = new TreeSet<>();
		set.add("M");
		set.add("N");
		set.add("O");
		set.add("P");
		set.add("Q");
		
//		System.out.println("fist value "+set.pollFirst());  // remove the first value
//		System.out.println("last value "+set.pollLast());   // remove the last value	
		
		// to print all elements in ascending order
		System.out.println("orginal set: "+set);
		// to print all elements in descending order
		System.out.println("reverse set: "+set.descendingSet());
		// to print only elements between "M" to "Q"
		System.out.println("sub set: "+set.subSet("M",true,"Q",false));
		// to print elements "M" to "O"
		System.out.println("head set: "+set.headSet("O",true));
		// to print elements after "O" 
		System.out.println("tail set: "+set.tailSet("O",false));
	}
}
