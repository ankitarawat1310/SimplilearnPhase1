package collection.Collection;

import java.util.TreeSet;

public class TreeSEtDemo {
	public static void main(String[] args) {
		 TreeSet<String> treeSet = new TreeSet<String>();
		 
		 treeSet.add("Java");
		 treeSet.add("Python");
		 treeSet.add("C++");
		 treeSet.add("C");
		 treeSet.add("C#");
		 treeSet.add("javaScript");
		 
		 System.out.println("TreeSet is : "+treeSet);
		 treeSet.remove("C");
		 treeSet.remove("C#");
		 
		 System.out.println("TreeSet after removing C and C#: "+treeSet );
		 
		 treeSet.add("VBscript");
		 treeSet.add("Cobol");
		 treeSet.add("HTML");
		 System.out.println("TreeSet after adding VBScript, Cobol, and HTML: "+treeSet );
		 
		 System.out.println("Check if java is there: "+treeSet.contains("Java"));
		 treeSet.clear();
		 
		 System.out.println("After deleting all ele: "+treeSet);
		 

		 
		 
		 
	}

}
