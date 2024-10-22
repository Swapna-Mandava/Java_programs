package assignments;

import java.util.Arrays;

public class Check_Anagram {
	
	public static void main(String[] args) {
		
		String s1="elbow";
		String s2="below";
		
		
		if(s1.length()!=s2.length()) 
		{
			System.out.println("They are not anagram");
		}
		
		else {
		char[] c1= s1.toCharArray();
		char[] c2= s2.toCharArray();
		
		Arrays.sort(c1);
		Arrays.sort(c2);
		System.out.println(Arrays.toString(c1));
		System.out.println(Arrays.toString(c2));
		
		boolean b1= Arrays.equals(c1, c2);
		if(b1==true) {
			System.out.println("It is a Anagaram");
		}
		else {
			System.out.println("It is not a Anagaram");
		}
		
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
