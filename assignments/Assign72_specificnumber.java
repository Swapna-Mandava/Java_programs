package assignments;

import java.util.HashMap;
import java.util.Map;

public class Assign72_specificnumber {
	
	public static void main(String[] args) {
		
		Map<String, Integer> m1=new HashMap<String, Integer>();
		
		m1.put("Ajay", 5678);
		m1.put("Arjun", 7896);
		m1.put("Manoj", 5893);
		m1.put("Kranthi", 4678);
		m1.put("vaibhav", 1236);
		m1.put("mouni", 6332);
		
		boolean b1=m1.containsValue(7896);
		
		if(b1==true) {
			
			System.out.println("The given number exists "  +  m1);
		}
		
		else {
			
			System.out.println("the given number doesnt exists");
		}
	}
	
	

}
