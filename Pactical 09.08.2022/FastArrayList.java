import java.util.ArrayList;
public class FastArrayList 
{
    public static void main(String args[])
    {  
        //Creating arraylist 
        ArrayList<String> al =new ArrayList<String>(); 
        al.add("Red");
        al.add("Green");
        al.add("Orange");
        al.add("White");
        al.add("Black");
        // Print the list
        System.out.println(al);
        // Now insert a color at the first and last position of the list
        al.add(0, "Pink");
        al.add(5, "Yellow");
        // Print the list
        System.out.println(al);
    }
}       

