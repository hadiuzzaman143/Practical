import java.util.Iterator;
import java.util.Stack;

public class StackDemo 
{
 
    public static void main(String[] args) 
    {
        // creating stack class
       Stack<Integer> s = new Stack<>();
       // checking empty or not
       boolean result =s.empty();
       //adding element (push)
       s.push(25);
       s.push(35);
       s.push(40);
       s.push(55);
       s.push(80);
       s.push(75);
       // result
       System.out.println("stack element :" + s);
       Integer digit = s.peek();
       System.out.println("top element:"+ digit);
       // search any element
       int digit1 = s.search(35); 
       System.out.println("search element :"+digit1);
       //find the size of the stack
       int x = s.size();
       System.out.println("stack size :" + x);
       //checking empty or not
       result = s.empty();
       System.out.println("is tha stack empty ? " + result);

    }    
}
