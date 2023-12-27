package SeleniumJava.SeleniumJava;

import java.util.ArrayList;
import java.util.List;

public class list {

	public static void main(String[] args) {
		List<String>list=new ArrayList<String>();
		list.add("Mango");
		list.add("Apple");
		list.add("Orange");
	for (String Fruit : list) {
		System.out.println(Fruit);	
		}
		
	System.out.println(list);
  // Adding For at 1st indexes
	list.set(0, "Guava");

	System.out.println(list);
	// Adding For at 2st indexes
		list.add(0, "Lemon");
		
		// // Now remove the current object from the updated list
        list.remove(1);

		System.out.println(list);
		System.out.println(list.get(0));
		System.out.println(list.get(1));
		List<String>list1=new ArrayList<String>();
		list1.addAll(list);
		System.out.println(list1);
		System.out.println(list1.hashCode());
	}
	
	

}
