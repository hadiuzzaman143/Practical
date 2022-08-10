import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListDemo 
{
  
    public static void main(String []args)
    {  
        //Creating arraylist 
        ArrayList<String> al =new ArrayList <String>(); 
        al.add("Red");
        al.add("Green");
        al.add("Orange");
        al.add("White");
        Iterator <String> itr1 = al.iterator();
        while(itr1.hasNext())
        {
          System.out.println(itr1.next());  
        }
  }
} 
