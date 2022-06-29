package collection.Collection;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Scanner;

public class LinkedhashSetDemo {
	public static void main(String[] args) {
		LinkedHashSet lhs=new LinkedHashSet();
		
		lhs.add(2);
		lhs.add(3);
		lhs.add(4.7f);
		lhs.add(8.9f);
		lhs.add('c');
		lhs.add('o');
		lhs.add(true);
		System.out.println("The linkedhasset is : "+lhs.getClass());
		
		Iterator itr=lhs.iterator();
        while(itr.hasNext()) {
        System.out.println("list is: "+ itr.next());
        }
        
        System.out.println("Enter number by user: ");
        LinkedHashSet<Integer> lhsInteger=new LinkedHashSet<Integer>();
        
        Scanner sc=new Scanner(System.in);
     // int n=sc.nextInt()
		
		
		for(int i=1;i<9;i++) {
			System.out.println("Elements entered by user are: ");
			lhsInteger.add(sc.nextInt());
		}
		
		System.out.println(lhsInteger);
	}

}

