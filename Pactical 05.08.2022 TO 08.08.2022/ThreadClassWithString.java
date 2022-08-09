public class ThreadClassWithString
{
    //main method
    public static void main(String[]args)
    {
        Thread obj = new Thread("first thread");
        obj.start(); // object
        String s = obj.getName();
        
        System.out.println(s);
    }
}