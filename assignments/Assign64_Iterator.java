package assignments;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Assign64_Iterator {
	
	public static void main(String[] args) {
		
		
		List li= new ArrayList();
		
		li.add(76);
		li.add(765);
		li.add(7);
		li.add(70);
		li.add(60);
		li.add(63); 
		li.add(55);
		
		
        Iterator l2=li.iterator();
        
        while(l2.hasNext()) {
        	System.out.println(l2.next());
        	
        }
		
	}

}
