package mainmethod;

import java.util.Scanner;

public class area_of_Triangle 
	{
	public static void main(String[] args) 
	{
		
	Scanner s1=new Scanner(System.in);
	System.out.println("Value of a is");
	float a=     s1.nextFloat();
	
		System.out.println("Base of Triangle is");
      int base=  s1.nextInt();
      System.out.println("Height of Triangle is");
      int height=  s1.nextInt();
      
      float area=a*base*height;  
      System.out.println("area of Triangle is = "+area);
      
	}
 
}
;