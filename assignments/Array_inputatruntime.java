package assignments;

import java.util.Arrays;
import java.util.Scanner;

public class Array_inputatruntime 
{
	public static void main(String[] args) {
		
		String employee[]=new String[4];
		Scanner s1=new Scanner(System.in);
		
		for(int i=0;i<4;i++) {
			
			employee[i]= s1.next();
			
		}
		
		System.out.println(Arrays.toString(employee));
			
}

}
