package assignments;

public class Matches_assignment46 {
	
	public static void main(String[] args) {
		
		
		String s1="I'm a boy";
		boolean b1=s1.matches("(.*)y");
		
		if (b1==true) {
			System.out.println("Ends with y");
		}
		else {
			System.out.println("Not ending with y");
		}
	}

}
