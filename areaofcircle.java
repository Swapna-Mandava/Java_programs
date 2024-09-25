package mainmethod;

import java.util.Scanner;

public class areaofcircle {
	public static void main(String[] args) 
	{
		Scanner s1=new Scanner(System.in);
		System.out.println("value of radius is");
		int r=     s1.nextInt();
		System.out.println("value of pi is");
		float pi=      s1.nextFloat();
		
		float area=pi*r*r;
		System.out.println("Area of circle is = "+area);
		
	}

}
