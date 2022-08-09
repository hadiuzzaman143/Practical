public class ThreadWithRunnableString implements Runnable
  {
    public void run()
    {
        System.out.println("Thread is running...");
    }
     public static void main(String[] args) 
    {
     Runnable r = new ThreadWithRunnableString();
     Thread t = new Thread(r,"first thread.");
     t.start();
     String s = t.getName();
     System.out.println(s);   
    }
  }  

