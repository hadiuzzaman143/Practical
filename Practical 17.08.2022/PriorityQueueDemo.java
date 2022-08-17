import java.util.Iterator;
import java.util.PriorityQueue;

public class PriorityQueueDemo 
{    
	public static void main(String[] args) 
    {     
		// created a PriorityQueue object and adding elements
		PriorityQueue<String> queue = new PriorityQueue<>();
		queue.add("Akash");
		queue.add("Sayan");
		queue.add("Sankhajit");
		queue.add("Hasan");
		queue.add("Jaita");
		queue.add("Owashim");
		queue.add("Tanmoy");
		
		// it throws an exception if this queue is empty. 
		System.out.println("head: "+queue.element());
		// this take head element,or returns null if this queue is empty.
		System.out.println("head: "+queue.peek());
		System.out.println("Iteratig elements");
		// traversing 
		Iterator<String> itr = queue.iterator();
		while(itr.hasNext()) 
        {
			System.out.println(itr.next());
		}
		// removing the elements from head of the elements
		queue.remove();
		queue.poll();
		
		System.out.println("--- after removing ---");
		// traversing
		Iterator<String> itr1 = queue.iterator();
		while(itr1.hasNext()) 
        {
			System.out.println(itr1.next());
		}
	}

}