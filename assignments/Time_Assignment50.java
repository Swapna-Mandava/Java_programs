package assignments;

import java.util.Date;

public class Time_Assignment50 {
	public static void main(String[] args) {
		
		Date d1= new Date();
		long l1= d1.getTime();
		System.out.println(l1);
		
		Date d2= new Date(d1.getTime());
		System.out.println(d2);
		
		String s1=d1.toString();
		
		String month=s1.substring(4, 7);
		System.out.println(month);
		
		String year=s1.substring(s1.length()-4);
		System.out.println(year);
		
		String date=s1.substring(8, 10);
		System.out.println(date);
		
		String dateformat=date.concat("-").concat(month).concat("-").concat(year);
		System.out.println(dateformat);
		
		
		
		
		
		
	}

}
