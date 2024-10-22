package assignments;

public class Matches_assignment45 {
	
	public static void main(String[] args) {
		
		String s1="My name is Ram";
		
		boolean b1=s1.matches("M(.*)");
		if(b1==true) {
			System.out.println("Starts with M");
			
		}
		else {
			System.out.println("It doesn't start with M");
		}
		
		
		
		
	}

}
