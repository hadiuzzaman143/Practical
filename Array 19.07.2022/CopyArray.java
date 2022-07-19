public class CopyArray 
{
 public static void main(String[]args)
 {
    char[]copyFrom={'d','e','c','f','f','e','i','n'};
    char[] copyTo=new char[7];
    System.arraycopy(copyFrom,1,copyTo,0,7);
    System.out.println(String.valueOf(copyTo));
 }    
}
