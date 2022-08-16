import java.util.HashSet;
import java.util.Iterator;

public class HashSetEg 
{
     // main class
    public static void main(String[] args) 
    {
       // main method
	  // create a HashSet and adding elements 
        HashSet<String> set = new HashSet();
       set.add("pen");
       set.add("pencil");
       set.add("Mouse");
       set.add("Phone");
       set.add(null);
       set.add("AC");
       set.add("Bottle");
       set.add("Earphone");
       set.add("Pen");
       // using iterator to inverse the elements
       Iterator<String>i = set.iterator();
       while (i.hasNext()) 
       {
        System.out.println(i.next());
       }

    }    
}
