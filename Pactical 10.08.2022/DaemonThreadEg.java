public class DaemonThreadEg extends Thread 
{  
    // main class
	// run() method
	public void run() 
    {
		System.out.println("Name: "+Thread.currentThread().getName());
		System.out.println("Daemon: "+Thread.currentThread().isDaemon());
	}
	public static void main(String[] args) 
    {    // main method
		// create object of the main class
		DaemonThreadEg t1 = new DaemonThreadEg();
		DaemonThreadEg t2 = new DaemonThreadEg();
		DaemonThreadEg t3 = new DaemonThreadEg();
		t1.setDaemon(true);  // set t1 as a daemon thread
		// invoked the run() method
		t1.start();
		t2.start();
		t3.start();
		
	}
}