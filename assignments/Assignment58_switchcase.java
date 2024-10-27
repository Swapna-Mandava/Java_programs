package assignments;

import java.util.Scanner;

public class Assignment58_switchcase {
	
	public static void main(String[] args) {
		
	 Scanner s1=new Scanner(System.in);
		int a=s1.nextInt();
		int b=s1.nextInt();
		System.out.println("enter operation u need to perform");
		String input=s1.next();
		
		switch(input) {
		case "add":
			System.out.println(a+b);
			break;
		case "sub":
			System.out.println(a-b);
			break;
		case "mul":
			System.out.println(a*b);
			break;
		default:
			System.out.println(a/b);
		
		}
		
		
		
	}

}
