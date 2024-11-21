package assignments;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class Assign65_ListIterator {
	
	public static void main(String[] args) {
		
		
		List l1= new ArrayList();
		
		
		l1.add(46);
		l1.add(64);
		l1.add(444);
		l1.add(25);
		l1.add("MKT");
		l1.add(null);
		l1.add(true);
		l1.add('c');
		l1.add(26);
		
		ListIterator l2=l1.listIterator();
		System.out.println("Farward");
		while(l2.hasNext()){
			System.out.println(l2.next());
			
		}
		System.out.println("Backward");
		while(l2.hasPrevious()){
			System.out.println(l2.previous());
			
		}
		
		
		
	}

}
