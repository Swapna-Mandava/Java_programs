package assignments;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class Assign70_Mapforloop {

	public static void main(String[] args) {
		
		Map <String,Integer> m1=new HashMap <String,Integer>();
		
		
		m1.put("Seethu", 5000);
		m1.put("Minnu",65000 );
		m1.put("Sunil",5000 );
		m1.put("Anil", 8562);
		m1.put("Ajay", 8562);
		m1.put("Deepika", 8562);
		
		System.out.println("*******Printing keys *******");
		for(String m3:m1.keySet()) {
			
			System.out.println(m3);
			
		}
		System.out.println("*******Printing values *******");
		
		for(Integer m3:m1.values()) {
			
			System.out.println(m3);
		}
		
		
		System.out.println("*******Printing key&values *******");
		for(Entry<String, Integer> m3:m1.entrySet()) {
			System.out.println(m3);
			
		}
		
		
		
		
	}

}
