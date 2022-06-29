package assignment.Thread;

class Factorial extends Thread{
	public void run() {
		fact(4);
	}
	
	synchronized void fact(int g) {
		int fact=1;
		for(int i=1; i<=g;i++) {
			fact=fact*i;
			/*try {
				Thread.sleep(400);
			}
			catch(Exception e) {
				System.out.println(e);
			}*/
			
		}
		
		System.out.println(Thread.currentThread().getName()+ " : factorial : "+fact);
	}
}



class Addition extends Thread{
public void run() {
		add(7,9);
	}

synchronized void add(int a,int b) {
	int sum=a+b;
	System.out.println(Thread.currentThread().getName()+ " : Addition : "+sum);
}
}

public class Test
{
	public static void main(String[] args) {
		
		Factorial t1=new Factorial();
	
		Factorial t2=new Factorial();
		
		Addition t3=new Addition();
		
		Addition t4=new Addition();
		
		
		t1.setName("T1");
		t2.setName("T2");
		t3.setName("T3");
		t4.setName("T4");
		
		
		t2.start();
		t4.start();
		t1.start();
		t3.start();
	}
}