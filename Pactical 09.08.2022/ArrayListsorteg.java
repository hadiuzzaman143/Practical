import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
public class ArrayListsorteg 
{
    public static void main(String args[])
    {  
        //Creating arraylist 
        ArrayList<String> al =new ArrayList<String>(); 
        
        //Adding object in arraylist  
        al.add("Ravi");
        al.add("Mamta");  
        al.add("Sankho");  
        al.add("Hadiuz");
        al.add("Sayan");
        al.add("jaita");
        al.add("sagnik");
        al.add("Uday");
        al.add("Pritam");
        al.add("Suruti");
        System.out.println("string sorted list:");
        Collections.sort(al);
        for (String s : al )
        {
            System.out.println(s);
        } 
        List<Integer> all =new ArrayList<Integer>(); 
        
        //Adding object in arraylist  
        all.add(20);
        all.add(30);  
        all.add(30);  
        all.add(40);
        all.add(50);
        all.add(60);
        all.add(70);
        all.add(10);
        all.add(80);
        all.add(90);
       System.out.println("Interger sorted list :");
       Collections.sort(all);
       for (Integer s : all )
        {
            System.out.println(s);
        } 
    }
}    
