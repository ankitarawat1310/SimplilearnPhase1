package assignment.CustomException;

import java.util.Scanner;


/*You need to check the salary of the person and based on that need to return the output from the program.
if salary < 2100  then return custom exception message as "you need to work hard"
if salary is between 2100 and 5000 then return custom exception message as "your salary is somehow good"
if salary is between 5100 and 9000 then return custom exception message as "salary is very good"
Design the custom exception class in this and take salary from the user.
*/
public class CustomException {
	
	static void validate(double salary) throws SalaryException{
		if(salary < 2000)
			throw new SalaryException("you need to work hard");
		else if(salary>= 2100 && salary<= 5000)
		System.out.println("your salary is somehow good");
		
		else if(salary>=5100 && salary <= 9000)
		System.out.println("salary is very good");
	}
	
	public static void main(String[] args) {
		try {
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter the salary: ");
			
				double salary=sc.nextDouble();
				validate(salary);
			
		}
		catch(Exception m) {
			System.out.println("Exception occured: "+m.getMessage());
		}
	}
}

class SalaryException extends Exception{
	
	 SalaryException(String s){
		 super(s);
	 }

}
