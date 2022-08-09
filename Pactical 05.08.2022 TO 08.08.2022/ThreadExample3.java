public class ThreadExample3 extends Thread
{
  public void run()
  {
    for(int i=0; i<5;i++)
    {
        try
        {
         Thread.sleep(800);
        }
        catch(InterruptedException e)
        {
            System.out.println(e);
        }
        System.out.println(i);
    }
    System.out.println(Thread.currentThread().getName());
  }
    // class
    public static void main(String[] args) 
    {
     ThreadExample3 t = new ThreadExample3();
     ThreadExample3 t1 = new ThreadExample3();
     ThreadExample3 t2 = new ThreadExample3();
     t2.setPriority(MAX_PRIORITY);
     System.out.println(t2.getPriority());
     System.out.println(Thread.currentThread().getPriority());
     t.start();
     t1.start();
     t2.start(); 
     t.setName("Thread-3"); 
    }   
}