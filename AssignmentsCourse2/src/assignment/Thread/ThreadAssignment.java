package assignment.Thread;

/**
 * 1. 3 threads are there with names
 * 2. two are norm priority and one is high priority
 * 3. you need to print the following:
 * 		1.state
 * 		2. running or not
 *  	3. daemon thread
 *  	4. alive
 * 3. 3 times will run with a pause of 4 sec
 * @author ankitarawat
 *
 */

public class ThreadAssignment extends Thread{
	public void run() {
		for(int i=1;i<4;i++) {
			try {
				Thread.sleep(4000);
			}
			catch(InterruptedException e)
			{
				System.out.println(e);
			}
			
			System.out.println("Running Thread state is : "+Thread.currentThread().getName()+" ::: "+ Thread.currentThread().getState());
			System.out.println("Running Thread Running or not :"+Thread.currentThread().getName()+" ::: "+Thread.currentThread().isAlive());
			System.out.println("Daemon or not :"+Thread.currentThread().getName()+" ::: "+Thread.currentThread().isDaemon());

			System.out.println("Running Thread is alive or not : "+Thread.currentThread().getName()+" ::: "+Thread.currentThread().isAlive());
			System.out.println();
			System.out.println("---------------------------------------------");
			System.out.println();
		}
	}
	
	public static void main(String[] args) {
		ThreadAssignment m1=new ThreadAssignment();
		ThreadAssignment m2=new ThreadAssignment();
		ThreadAssignment m3=new ThreadAssignment();
		
		m1.setName("M1 FirstThread");
		m2.setName("M2 SecondThread");
		m3.setName("M3 ThirdThread");
		
		m1.setPriority(NORM_PRIORITY);
		m2.setPriority(NORM_PRIORITY);
		m3.setPriority(MAX_PRIORITY);
		m1.start();
		m2.start();
		m3.start();
	}

}
