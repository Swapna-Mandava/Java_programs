package mainmethod;

import java.util.Scanner;

public class intialise_scanner  // program to intialize and declare each method of scanner class

{

	public static void main(String[] args) {
	
		
		Scanner s1=new Scanner(System.in);
		System.out.println("Capital of India is");
		String capital=   s1.next();
		
		System.out.println("Is Hindi national language");
			
		boolean b=    s1.nextBoolean();
		
		System.out.println("Population of India");
		long c=  s1.nextLong();
		
		System.out.println("HOuse no is");
		byte house=  s1.nextByte();
		
		
		

	}

}
