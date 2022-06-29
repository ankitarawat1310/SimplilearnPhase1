package assignment.Filehandling;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

/** Take user input from user console and perform create and write operation in to txt file Weekend.txt and perform read operation***/

public class FileReadFileWriteDemo {
	
	
	public static void main(String[] args)  {
		
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the Text: ");
		
		String text=sc.nextLine();
		
			
		try {
			FileWriter output=new FileWriter("/Users/ankitarawat/eclipse-workspace/PGCourse_Phase1/Assignments_Phase1/AssignmentsCourse2/Weekend.txt");
	
			output.write(text);
			System.out.println("Data is written to the file.");
			System.out.println();
			output.close();
			
			char[] array=new char[60];
			
			FileReader input=new FileReader("/Users/ankitarawat/eclipse-workspace/PGCourse_Phase1/Assignments_Phase1/AssignmentsCourse2/Weekend.txt");
			input.read(array);
			System.out.println("Data in the file read by us: " );
			System.out.println(array);
			input.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
	
	
	}

}
