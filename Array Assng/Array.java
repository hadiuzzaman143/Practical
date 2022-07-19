import java.util.Scanner;
public class Array
{
    // Function that returns the average of an array.
    static double array(int a[], int n)
    {
        // Find sum of array element
        int sum = 0;
        for (int i = 0; i < n; i++)
        {
            sum += a[i];
        }
        System.out.println("elements in the array is:"+sum);
        return (double)sum /n;
    }
    //
    
    //driver code
    public static void main (String[] args)
    {
        Scanner sc=new Scanner(System.in);
        
        int n;  //Declare array size
        System.out.println("Enter the elements in the array:");
        n=sc.nextInt();  //Initialize the array size
        
        int arr[] = new int[n];    //Declare array
        System.out.println("Enter the array elements:");
        for(int i=0;i<n;i++)      //Initialize the array
        {
            arr[i]=sc.nextInt();
        }
     
        System.out.println("The average of all the elements:"+array(arr, n));
    }
}