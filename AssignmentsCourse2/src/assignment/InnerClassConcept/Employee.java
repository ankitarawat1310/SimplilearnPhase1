package assignment.InnerClassConcept;

public class Employee {
	float salary;
	
	public Employee(int salary) {
		this.salary=salary;
	}
	
	class PermEmployee{
		
		String code="PE01";	
		double hike=0.45f;
		
		void new_salary() {
			double newSalary;
			newSalary=salary +  (salary * hike);
			System.out.println("New Salary after hike for Perm employee: "+newSalary);
		}
		
		public void display() {
			System.out.println("****Inside class PermEmployee****");

			System.out.println("Salary of the employee: "+salary);
			System.out.println("Code of the employee: "+code);
			System.out.println("Hike of the employee: "+hike);
			System.out.println();
		}
		
	}
	
	class TempEmployee{
		String code="TE01";
		float hike=0.30f;
		
		
		void new_salary() {
			float newSalary;
			newSalary=salary + (salary * hike);
			
			System.out.println("New  Salary after hike for Tech employee: "+newSalary);
		}
		
		public void display() {
			System.out.println("****Inside class TempEmployee****");

			System.out.println("Salary of the employee: "+salary);
			System.out.println("Code of the employee: "+code);
			System.out.println("Hike of the employee: "+hike);
			System.out.println();
		}
	}
	
	void role() {
		class ContractEmployee
		{
			String code="CE01";
			float hike=0.30f;
			
			void new_salary() {
				float newSalary;
				newSalary=salary + (salary * hike);
				
				System.out.println("New  Salary after hike for Contract employee: "+newSalary);
			}
			
			public void display() {
				System.out.println("****Inside class ContractEmployee of the role method****");
				System.out.println("Salary of the employee: "+salary);
				System.out.println("Code of the employee: "+code);
				System.out.println("Hike of the employee: "+hike);
				System.out.println();
			}
		}
		
		ContractEmployee C=new ContractEmployee();
		C.new_salary();
		C.display();
	}
	
	public static void main(String[] args) {
		Employee obj=new Employee(60000);
		Employee.PermEmployee p=obj.new PermEmployee();
		p.new_salary();
		p.display();
		
		Employee.TempEmployee t=obj.new TempEmployee();
		t.new_salary();
		t.display();
		
		obj.role();
		
	}

}
