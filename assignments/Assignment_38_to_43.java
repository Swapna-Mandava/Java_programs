package assignments;

public class Assignment_38_to_43 {
	
	public static void main(String[] args) {
		
		
		String name="Tadithya 369";  
		String name1= name.replace('T', 'A'); //Assignment 38
		System.out.println(name1);
		
		String city="I'm from Udaipur";
		String city1=city.replace("Udaipur", "Andhra"); //Assignment 39
		System.out.println(city1);
		
		String account= "SBI account no is 56";
		String account1= account.replace("56", " "); //Assignment 40
		System.out.println(account1);
		
		
		String id="id no is 10123456";
		
		String id1= id.replaceAll("[a-z]", " "); // Assignment 41
		System.out.println(id1);
		
		String boss="I am the Boss";
		String boss1=boss.replaceAll("[A-Z]", " "); // Assignment 42, replacing capital alphabets
		System.out.println(boss1);
		
		String place="My home is near to sector 2 in hyd- 40150";
		String place1=place.replaceAll("[0-9]", " ");  //Assignment 43 ,replacing numbers
		System.out.println(place1);
		
		
		
		
		
		
		
		
		
		
	}

}
