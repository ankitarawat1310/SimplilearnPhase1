/**Assignment- We have two process or methods P and P2 where P1 is factorial method and P2 is addition of two numbers method
 * T1 and T2 are two threads in Process P1 and T3 and T4 are two threads in Process p2 and all threads (T1,T2,T3, T4) are starts at the same time 
 * output order-
 * t2,t4,t1,t3
 */

package assignment.Thread;
 class Calculate {

	
	void printFactorial(int n) {
		System.out.println("I am into factorial method");
		
		synchronized (this) {
			int fact=1;
			for(int i=1; i<=n;i++) {
				fact=fact*i;
				try {
					Thread.sleep(400);
				}
				catch(Exception e) {
					System.out.println(e);
				}
				
			}
			
			System.out.println("Factorial of: "+n+" is "+fact);
		}
	}
	
	
	void addTwoNumbers(int x,int y) {
		System.out.println("Adding : "+x+" : and "+y);
		synchronized (this) {
			int sum=x+y;
			
			try {
				Thread.sleep(400);
			}
			catch(Exception e) {
				System.out.println(e);
			}
			System.out.println("Sum of x and y: "+sum);
			
		}
	}
}


class MyThread_factorial extends Thread{
	
	Calculate t;
	MyThread_factorial(Calculate t){this.t=t;}
	
	public void run() {
		t.printFactorial(5);;
		
	}
	
}

class MyThread_Addition extends Thread{
	
	Calculate t;
	MyThread_Addition(Calculate t){this.t=t;}
	
	public void run() {
		t.addTwoNumbers(5, 9);
	}
	
}

public class SynchronizedThread
{
	public static void main(String[] args) {
		Calculate obj=new Calculate();
		
		MyThread_factorial t1=new MyThread_factorial(obj);
		MyThread_factorial t2=new MyThread_factorial(obj);
		
		MyThread_Addition t3=new MyThread_Addition(obj);
		MyThread_Addition t4=new MyThread_Addition(obj);
		t2.start();
		t4.start();
		t1.start();
		t3.start();
	}
}




