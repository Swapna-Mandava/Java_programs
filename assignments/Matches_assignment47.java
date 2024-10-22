package assignments;

public class Matches_assignment47 {
	
	public static void main(String[] args) {
		
		
		String input="I'm a simple boy";
		boolean b1=input.matches("(.*)s(.*)");
		
		if (b1==true) {
			System.out.println("S is present in it");
		}
		else {
			System.out.println("S is not present in it");
		}
	}

}
