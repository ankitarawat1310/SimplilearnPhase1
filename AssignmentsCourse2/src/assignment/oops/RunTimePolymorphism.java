package assignment.oops;

class Person{
	public void sleep() {
		System.out.println("Sleep method inside the Parent which is Person class");
	}
	
	public void eat() {
		System.out.println("Eat method inside the parent class which is Person class");
	}
	
	public void work() {
		System.out.println("Work method inside the parent class which is Person class");
	}
	
}

class Employee extends Person{
	public void sleep() {
		System.out.println("Sleep method inside the Child which is Employee class");
	}
	
	public void eat() {
		System.out.println("Eat method inside the child class which is Employee class");
	}
	
	public void work() {
		System.out.println("Work method inside the Child class which is Employee class");
	}
	
}

class Student extends Person{
	public void sleep() {
		System.out.println("Sleep method inside the child class which is Student class");
	}
	
	public void eat() {
		System.out.println("Eat method inside the child class which is Student class");
	}
	
	public void work() {
		System.out.println("Work method inside the child class which is Student class");
	}
	
}

class Teacher extends Person{
	public void sleep() {
		System.out.println("Sleep method inside the child which is Teacher class");
	}
	
	public void eat() {
		System.out.println("Eat method inside the child class which is Teacher class");
	}
	
	public void work() {
		System.out.println("Work method inside the child class which is Teacher class");
	}
	
}

class RoleOther extends Person{
	public void sleep() {
		System.out.println("Sleep method inside the child which is RoleOther class");
	}
	
	public void eat() {
		System.out.println("Eat method inside the child class which is RoleOther class");
	}
	
	public void work() {
		System.out.println("Work method inside the child class which is RoleOther class");
	}
	
}

public class RunTimePolymorphism {
	public static void main(String[] args) {
		
		Person p=new Person();
		p=new Employee();
		p.work();
		p.eat();
		System.out.println();
		p=new Student();
		p.sleep();
		System.out.println();
		p=new Teacher();
		p.eat();
		p.sleep();
		p.work();
		System.out.println();
		p=new RoleOther();
		p.work();
	}

}
