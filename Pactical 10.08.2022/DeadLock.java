public class DeadLock 
{   
     //  main class
	public static void main(String[] args) 
    { 
          // main method
		// string value
		final String r1 = "Hadiuz";
		final String r2 = "Adi";
		
		// t1 tries to lock r1 then r2
		Thread t1 = new Thread() 
        { 
			public void run() 
            {
				// synchronized block
				synchronized (r1) 
                {
				System.out.println("Thread 1: locked R1");	
				// try block
				try {
					Thread.sleep(400);
					
				} catch (Exception e) 
                {
					System.out.println(e);
				}
				// synchronized block
				synchronized (r2) 
                {
				 System.out.println("Thread 1: locked R2");	
				}
				}
			}
		};   
		
		// t2 tries to lock r2 then r1
		Thread t2 = new Thread() 
        {  
			public void run() 
            {
				// synchronized block
				synchronized (r2) 
                {
				System.out.println("Thread 2: locked R2");	
				// try block
				try {
					Thread.sleep(100);
					
				} catch (Exception e) 
                {
					System.out.println(e);
				}
				// synchronized block
				synchronized (r1) 
                {
				 System.out.println("Thread 2: locked R1");	
				}
				}
			}
		};   
		// invoke the run() method
		t1.start();
		t2.start();
	}
}
