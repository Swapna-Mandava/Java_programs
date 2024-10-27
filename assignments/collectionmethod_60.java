package assignments;

import java.util.ArrayList;
import java.util.Collection;

public class collectionmethod_60 {
	
	public static void main(String[] args) {
		
		
		Collection c1=new ArrayList();
		
		c1.add(73);
		c1.add(56);
		c1.add(86);
		c1.add(73);
		c1.add(73);
		c1.add(null);
		
		System.out.println(c1);
		
		Collection c2=new ArrayList();
		
		c2.addAll(c1);
		c2.add("testing");
		c2.add(9);
		c2.add(19);
		 System.out.println(c2);
		 
		boolean b1= c1.remove(null);
		if(b1==true) {
			System.out.println("Null is removed");
			
		}
		
		 c2.removeAll(c1);
			System.out.println("c1 is removed");
			
		
		
		boolean b2=c1.equals(c2);
		if(b2==true) {
			System.out.println("C1==2");
		}
		else {
			System.out.println("C1 is not equal to c2");
		}
		
		c2.contains("testing");
		
		
			System.out.println("given word is present in c2");
		
		
		boolean s1=c2.containsAll(c1);
		
		if(s1==true) {
			System.out.println("c1 contains all c2");
		}
		else {
			System.out.println("c1 doesn't contains all c2");
		}
		
		boolean s2=c1.isEmpty();
		
		if(s2==true) {
			System.out.println("c1 is not empty");
		}
		else {
			System.out.println("c1 is  empty");
		}
		
		// c1.clear();
		System.out.println("c1 is cleared"+c1);
	}

}
