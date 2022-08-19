import java.util.EmptyStackException;
import java.util.Stack;
public class Stackeg1 
{
    public static void main(String[] args) 
    {
       Stack<Integer> s = new Stack<>();
       System.out.println("sstack:"+s);
        // adding element (push or pop)
       pushelement(s,15);
       pushelement(s,45);
       pushelement(s,20);
       pushelement(s,30);
       popelement(s);
       popelement(s);
       try
       {
        popelement (s);
       }
       catch(EmptyStackException e)
       {
        System.out.println("Stack empty");
       }
    }
    // push operation
    private  static void pushelement (Stack<Integer> s ,int i)
    //invoke push() method
    {
     s.push(new Integer(i));
     System.out.println("push :"+i);
     System.out.println("stack :"+s);
    }
     // pop operation
    private static void popelement(Stack<Integer> s) 
    //invoke pop method
    {
        Integer i = (Integer)s.pop();
        System.out.println("pop:"+i);
        System.out.println("stack :"+s);   
    }
}
