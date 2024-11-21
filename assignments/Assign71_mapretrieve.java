package assignments;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Assign71_mapretrieve {
	
	public static void main(String[] args) {
		
		Map<String, Integer> m1= new HashMap <String, Integer> ();
		
		m1.put("Mango", 30);
		m1.put("Apple", 400);
		m1.put("Banana", 130);
		m1.put("watermelon", 50);
		m1.put("grapes", 400);
		m1.put("Guava", 3000);
		
	
		
		System.out.println("printing fruit quantites");
		for( Integer m3:m1.values()) {
			System.out.println(m3);
		}
		
		

		System.out.println("printing all fruits with quantity");
			
			for(Entry<String, Integer> m4:	m1.entrySet()) {
				System.out.println(m4);
			}
			
			
			
			
		
		
		m1.remove("Banana"); //remove fruit
		System.out.println("Remove Banana"+  m1);
	
		
		
	}

}
