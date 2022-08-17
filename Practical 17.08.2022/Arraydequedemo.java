import java.util.ArrayDeque;
import java.util.Deque;

public class Arraydequedemo 
{
    public static void main(String[]args)
    {
        // created a Deque object and adding elements
        Deque<String> deque = new ArrayDeque<String>(); 
        {
         deque.add("Pallabi");
         deque.add("Subhrajit");
         deque.add("Mamta");
         deque.add("Monalisha");
         deque.offerFirst("Anju");
         // take input to the After offer first elements
         System.out.println("After offer first");
         for(String str:deque)
         {
            System.out.println(str);
         }   
         deque.pollLast(); // deque.poll() & deque.
          // take input to the After poll Last elements
         System.out.println("After poll Last");
         for(String str:deque)
         {
            System.out.println(str);
         }
        }
    }  
}
