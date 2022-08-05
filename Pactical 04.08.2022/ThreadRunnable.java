public class ThreadRunnable implements Runnable 
{    
    // class implements the runnable interface

	@Override
	public void run() 
    {   
         // method
		System.out.println("Thread is running.");
	}
	public static void main(String[] args) 
    {   
         // main method
		Thread t = new Thread(new ThreadRunnable());     // object of Runnable interface
		t.start();    // to invoke the run() method
	}
}