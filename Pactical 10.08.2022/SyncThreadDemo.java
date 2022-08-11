public class SyncThreadDemo 
{   
  // parent class
	synchronized void print(int num) 
  {    
    // synchronized method
		// loop to thread execution
		for(int i = 1; i <= 5; i++) 
    {
			System.out.println(num*i);
			// try block
			try 
      {
				Thread.sleep(500);
			}
			// catch block
			catch (Exception e) 
      {
				System.out.println(e);
			}
		}
	}
}
// sub class extending Thread class
class ThreadTesting extends Thread 
{
	SyncThreadDemo t;   
  // assigned class variable
	public ThreadTesting(SyncThreadDemo t) 
  {    
    // parameterized constructor
		this.t = t;
	}
	public void run() 
  {  // run() method
		t.print(3);
	}
}
//sub class extending Thread class
class ThreadTesting1 extends Thread 
{
	SyncThreadDemo t;   // assigned class variable
	public ThreadTesting1(SyncThreadDemo t)
  {    
    // parameterized constructor
		this.t = t;
	}
	public void run() 
  {   
    // run() method
		t.print(5);
	}
}

class NonSyncThread 
{   
  // main class 
	public static void main(String[] args) 
  {   
    // main method
		// derived class objects
		SyncThreadDemo s = new SyncThreadDemo();
		ThreadTesting tr1 = new ThreadTesting(s);
		ThreadTesting1 tr2 = new ThreadTesting1(s);
		// invoked the run() method
		tr1.start();
		tr2.start();
	}
}
