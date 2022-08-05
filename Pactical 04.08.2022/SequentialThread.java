public class SequentialThread 
{  
     // class
	public void run() 
    {   
        // run() method
		for(int  i = 1; i <= 5; i++) 
        {    
            // loop to check available threads
			try {
				Thread.sleep(200);   // thread will sleep/pause for a specific time
			} catch (InterruptedException e) 
            {
				System.out.println(e);
			}
			System.out.println(i);    // print values
		}
	}
	public static void main(String[] args) 
    {    
         // main method
		SequentialThread t1 = new SequentialThread();    // object
		SequentialThread t2 = new SequentialThread();    // object
		SequentialThread t3 = new SequentialThread();    // object
		t1.run();   // called the method
		t2.run();   // called the method
		t3.run();   // called the method
	}
}