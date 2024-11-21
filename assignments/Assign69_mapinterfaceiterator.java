package assignments;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public class Assign69_mapinterfaceiterator {
	
	public static void main(String[] args) {
		
		
		Map<String,Integer> m1= new HashMap <String,Integer>();
		
		m1.put("Sudheer",8532 );
		m1.put("Minnu",65000 );
		m1.put("Nitya",5000 );
		m1.put("Anil", 8562);
		

		Iterator<Entry<String,Integer>> i1=m1.entrySet().iterator();
		
		while(i1.hasNext()) {
			
			System.out.println(i1.next());
		}
		
		
		
		
		
	}

}
