package mainmethod;

import java.util.Scanner;

public class circumfereance 
{
	public static void main(String[] args) 
	{
		Scanner s1=new Scanner(System.in);
		
		System.out.println("value of a is");
		int a=   s1.nextInt();
		
		System.out.println("Value of pi is");
		float pi=    s1.nextFloat();
		
		
		System.out.println("Value of radius is");
		int radius=   s1.nextInt();
		

	
	float circumferance= a*pi*radius;
		System.out.println("Circumferance of circle is--"+circumferance);
		
	}

}
;
