
public class ThreadTest extends Thread{   // thread
	public void run() {    // run() method
		System.out.println("i am a thread");
	}
	public static void main(String[] args) {   // main method
		ThreadTest t1 = new ThreadTest();    // object
		t1.start();   // to invoke the run() method
	}
}