import java.util.Stack;

public class Stackeg
{
    
    public static void main(String[] args) 
    {
        // creating stack class
       Stack<Integer> s = new Stack<>();
       // checking empty or not
       boolean result =s.empty();
       // adding element (push)
       s.push(25);
       s.push(35);
       s.push(40);
       s.push(55);
       s.push(80);
       s.push(75);
       // display the element
       System.out.println("Element are :" + s);
       result = s.empty();
       System.out.println("is the stack empty ?" + result);
    }

}