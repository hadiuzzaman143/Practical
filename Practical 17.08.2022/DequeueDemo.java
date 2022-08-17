import java.util.ArrayDeque;
import java.util.Deque;

public class DequeueDemo 
{    
    // main class
	public static void main(String[] args) 
    {   
        
		// created a Deque object and adding elements
		Deque<String> deque = new ArrayDeque<>();
		deque.add("pallbi");
		deque.add("subhrajit");
		deque.add("mamta");
		deque.add("monalisa");
		// take input to the head of elements
		deque.offerFirst("anju");
		System.out.println("after offer first");
		
		// traversing
		for(String str : deque) 
        {
			System.out.println(str);
		}
		
		// deque.poll() & deque.pollFirst both same
		deque.pollLast();
		System.out.println("after poll last");
		
		// traversing 
		for(String str : deque) 
        {
			System.out.println(str);
		}
		
		// new Deque object
		Deque<String> dq = new ArrayDeque<>();
		dq.add("Ram");
		dq.add("Karan");
		dq.add("Riya");
		dq.add("Priya");
		dq.add("Sam");
		dq.add("Ajay");
		// traversing
		for(String s : dq) 
        {
			System.out.println(s);
			// add new elements
			dq.addFirst("Shree");
			dq.addLast("Riya");
			
			System.out.println("New List");
			// traversing using for each loop
			for(String s1 : dq) 
            {
				System.out.println(s1);
			}
			// remove elements
			dq.removeFirst();
			dq.removeLast();
			System.out.println("new list after removal");
			// traversing using for each loop
			for (String s2 : dq) 
            {
				System.out.println(s2);
			}
		}
	}
}
