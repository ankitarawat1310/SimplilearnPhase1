package assignment.oops;

class Product{
	int id;
	String name="Amul";
	
	public void display() {
		System.out.println("Value of id and name is: "+id+" "+name);
	}
}

class A extends Product{
	int count=50;
	String category="butter";
	public void display() {
		System.out.println("Value of id,name,count and category is: "+id+" "+name+" "+count+" "+ category);
	}
	
}

class B extends Product{
	int count=90;
	String category="Milk";
	public void display() {
		System.out.println("Value of id,name,count and category is: "+id+" "+name+" "+count+" "+ category);
	}
}

class C extends Product{
	int count=56;
	String category="Choco";
	public void display() {
		System.out.println("Value of id,name,count and category is: "+id+" "+name+" "+count+" "+ category);
	}
}

class subA extends A{
	float price=30;
	
	public void display() {
		double total_price=count* price;
		System.out.println("Value of id,product name, and category: "+id+" "+name+" "+count+" "+category);
		System.out.println("Total price of the product: "+total_price);
	}
}

class subB extends B{
float price=10;
	
	public void display() {
		double total_price=count* price;
		System.out.println("Value of id,product name, and category: "+id+" "+name+" "+count+" "+category);
		System.out.println("Total price of the product: "+total_price);
	}
	
}

public class InheritanceExample {
	public static void main(String[] args) {
		A objA=new A();
		B objB=new B();
		C objC=new C();
		subA objsubA=new subA();
		subB objsubB=new subB();
		
		objA.display();
		objB.display();
		objC.display();
		objsubA.display();
		objsubB.display();
	}
	
}


