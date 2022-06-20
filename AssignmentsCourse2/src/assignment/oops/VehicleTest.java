package assignment.oops;

 abstract class Vehicle{
	int speed= 100;
	long distance= 2000L;
	
	
	abstract public void run();
	
	abstract public void stop();
	
	public void fuel(int value1) {
		System.out.println("Fuel method with int parameter: "+value1);
	}
	
	public void fuel(float value1,String value2) {
		System.out.println("Fuel method with float and String parameters: "+value1+" and "+value2);
	}
	
	public void fuel(char value1,int value2) {
		System.out.println("Fuel method with char and int parameters: "+value1+" and "+value2);
	}
	
	public void display() {
		System.out.println("****Displaying values in Parent class*****");
		System.out.println("Speed is: "+this.speed);
		System.out.println("Distance is: "+this.distance);
	}
	 Vehicle(){
		System.out.println("I am in the parent constructor");
	}
	
	 Vehicle(int speed, long distance) {
		this.speed=speed;
		this.distance=distance;
	}
	
	
}

class TwoWheeler extends Vehicle{
		int nos_of_tyres=2;
		int speed= 200;
		long distance=7000L;
		
		@Override
		public void run() {
		System.out.println("Run method overrided in two wheeler class");	
		}
		
		@Override
		public void stop() {
			System.out.println("Stop method overrided in two wheeler class");
		}
		
		 TwoWheeler(){
			super();
			System.out.println("I am in the TwoWheeler default constrctor");
		}
		
		 public void display() {
			System.out.println("*****Displaying the TwoWheeler variables****");
			System.out.println("Speed is: "+this.speed);
			System.out.println("Distance is: "+this.distance);
			System.out.println("Number of tyres are: "+this.nos_of_tyres);
			super.display();
			System.out.println("---------------------------------------");
		}
	}

class ThreeWheeler extends Vehicle{
	int nos_of_tyres=3;
	int speed= 250;
	long distance=7500L;
	
	@Override
	public void run() {
	System.out.println("Run method overrided in three wheeler class");	
	}
	
	@Override
	public void stop() {
		System.out.println("Stop method overrided in three wheeler class");
	}
	
	 ThreeWheeler(){
		super();
		System.out.println("I am in the ThreeWheeler default constrctor");
	}
	
	public void display() {
		System.out.println("*****Displaying the ThreeWheeler variables****");
		System.out.println("Speed is: "+this.speed);
		System.out.println("Distance is: "+this.distance);
		System.out.println("Number of tyres are: "+this.nos_of_tyres);
		super.display();
		System.out.println("---------------------------------------");
	}
}


class FourWheeler extends Vehicle{
	int nos_of_tyres=4;
	int speed= 50;
	long distance=5000L;
	
	@Override
	public void run() {
	System.out.println("Run method overrided in four wheeler class");	
	}
	
	@Override
	public void stop() {
		System.out.println("Stop method overrided in four wheeler class");
	}
	
	 FourWheeler(){
		super();
		System.out.println("I am in the FourWheeler default constrctor");
	}
	
	public void display() {
		System.out.println("*****Displaying the FourWheeler variables****");
		System.out.println("Speed is: "+this.speed);
		System.out.println("Distance is: "+this.distance);
		System.out.println("Number of tyres are: "+this.nos_of_tyres);
		super.display();
		System.out.println("---------------------------------------");
	}
}

class EightWheeler extends Vehicle{
	int nos_of_tyres=8;
	int speed= 60;
	long distance=59990L;
	
	@Override
	public void run() {
	System.out.println("Run method overrided in eight wheeler class");	
	}
	
	@Override
	public void stop() {
		System.out.println("Stop method overrided in eight wheeler class");
	}
	
	 EightWheeler(){
		super();
		System.out.println("I am in the EightWheeler default constrctor");
	}
	
	public void display() {
		System.out.println("*****Displaying the EightWheeler variables****");
		System.out.println("Speed is: "+this.speed);
		System.out.println("Distance is: "+this.distance);
		System.out.println("Number of tyres are: "+this.nos_of_tyres);
		super.display();
		System.out.println("---------------------------------------");
	}
}

public class VehicleTest {
	public static void main(String[] args) {
		
		Vehicle Two=new TwoWheeler();
		Two.run();
		Two.stop();
		Two.display();
		
		
		Vehicle Three=new ThreeWheeler();
		Three.run();
		Three.stop();
		Three.display();
		
		Vehicle Four=new FourWheeler();
		Four.run();
		Four.stop();
		Four.display();
		
		Vehicle Eight=new EightWheeler();
		
		Eight.run();
		Eight.stop();
		Eight.display();
		
		Eight.fuel(50);
		Eight.fuel('a', 50);
		Eight.fuel(50.90f, "Testing");
	
	}

}
