package assignment.Filehandling;

import java.io.BufferedOutputStream;
import java.io.DataInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Test 
{ 
    public static void main(String[] args) throws IOException  
    { 
        //Step 1: attach keyboard to DataInputStream 
        DataInputStream dis=new DataInputStream(System.in); 
  
        // Step 2: attach file to FileOutputStream 
        FileOutputStream fout=new FileOutputStream("/Users/ankitarawat/eclipse-workspace/PGCourse_Phase1/Assignments_Phase1/AssignmentsCourse2/Learn.txt",true); 
  
        //Step 3:attach FileOutputStream to BufferedOutputStream 
        BufferedOutputStream bout=new BufferedOutputStream(fout,1024); 
        System.out.println("Enter text (@ at the end):"); 
        char ch; 
  
        //read characters from dis into ch. Then write them into bout. 
        //repeat this as long as the read character is not @ 
        while((ch=(char)dis.read())!='@') 
        { 
            bout.write(ch); 
        } 
        //close the file 
        bout.close(); 
    } 
} 

