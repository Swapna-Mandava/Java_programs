package mainmethod;

import java.util.Scanner;

public class Swith_scannerlass {
	
	public static void main(String[] args) {
		
	Scanner s1=new Scanner(System.in);
	
	System.out.println("press 1 for chrome");
	System.out.println("press 2 for safari");
	System.out.println("press 3 for explorer");
	System.out.println("press 4 for firefox");
	int input=   s1.nextInt();
	switch(input)
	
	{case 1: System.out.println("launching chrom browser");
    break;
case 2: System.out.println("launching internet browser");
break;
case 3: System.out.println("launching safari browser");
break;
case 4: System.out.println("launching firefox browser");
break;

default:
System.out.println("your selection is wrong");
	}
	

	
	
}
	
	
	}


