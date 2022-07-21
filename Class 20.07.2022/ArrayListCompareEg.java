import java.util.ArrayList;
import java.util.List;

public class ArrayListCompareEg 
{
 public static void main(String[]args)
 {
    List<String> al =new ArrayList<String>();
    al.add("Rose");
    al.add("Sunflower");
    al.add("Lily");
    al.add("Daisy");
    al.add("MariGold");
    al.add("Tulip");
    al.add("Jasmine");
    System.out.println(al);
    List<String>all = new ArrayList<String>();
    al.add("Rose");
    al.add("Sunflower");
    al.add("Lily");
    al.add("Daisy");
    al.add("MariGold");
    al.add("Tulip");
    al.add("Jasmine");
    System.out.println(al);
    boolean b = al.equals(all);
    System.out.println(b);
    all.add("Red Rose");
    boolean b1 = al.equals(all);
    System.out.println(b1);

 }
}
