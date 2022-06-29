package assignment.Filehandling;

import java.io.BufferedOutputStream;
import java.io.DataInput;
import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamDemo {
	public static void main(String[] args) throws IOException {
		DataInputStream dis=new DataInputStream(System.in);
		
		
			FileOutputStream fout=new FileOutputStream("/Users/ankitarawat/eclipse-workspace/PGCourse_Phase1/Assignments_Phase1/AssignmentsCourse2/day2.txt");
			 BufferedOutputStream bout=new BufferedOutputStream(fout, 1024);
			 
			 System.out.println("Enter text @ at the end: ");
			 
			 char ch;
			 
			 while((ch=(char)dis.read())!='@')
			 {
				 bout.write(ch);
				 
				 
			 }
		
			 bout.close();
			
			/*FileInputStream fin=new FileInputStream("/Users/ankitarawat/eclipse-workspace/PGCourse_Phase1/Assignments_Phase1/AssignmentsCourse2/day2.txt");
			System.out.println("Number of Bytes read: "+fin.available());
			
			System.out.println("Data inside file to be read: ");
			int ch1; 
		      while((ch1=fin.read())!=-1) 
		          System.out.print((char)ch1); 
		    
		      fin.close();*/
		  	
				
	}
}
