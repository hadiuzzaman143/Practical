import java.util.ArrayList;

public class ArrayListEg 
{
    public static void main(String args[])
    {  
        //Creating arraylist 
        ArrayList<String> al =new ArrayList<String>(); 
        
        //Adding object in arraylist  
        al.add("Ravi");
        al.add("Adi");  
        al.add("Sankho");  
        al.add("Hadiuz");
        al.add("Sayan");
        al.add("jaita");
        al.add("sagnik");
        al.add("Uday");
        al.add("Pritam");
        al.add("Owashim");
        
        //Traversing list through Iterator  
        
        System.out.println("size of array list :"+al.size());
        al.remove(5);
        System.out.println(al);
        System.out.println("size of array list :"+al.size()); 
        al.add("Ravi");
        al.add("Viswa");
        System.out.println(al);
        System.out.println("size of array list :"+ al.size());
        System.out.println("element of index value is :"+al.get(6));
        System.out.println("traversing using for loop");
        for (int i=0; i<al.size();i++) 
        {
            
        }
    }  
}      
