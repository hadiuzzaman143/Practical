public class ThreadDemo extends Thread 
{    
    // class
	public void run() 
    {     
        // method
		System.out.println("T am thread....its running");
	}
	public static void main(String[] args) 
    {   
        // main method
		ThreadDemo t = new ThreadDemo();    // object
		t.start();   // to invoke the run() method
		String s = t.getName();    // to get the thread slot
		System.out.println(s);
	}
}
