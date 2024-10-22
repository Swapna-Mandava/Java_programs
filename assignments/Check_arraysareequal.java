package assignments;

import java.util.Arrays;

public class Check_arraysareequal {
	public static void main(String[] args) {
		
		String name[]= new String[4];
		
		name[0]="Ram";
		name[1]="Ramu";
		name[2]="Ramulu";
		name[3]="Ramprasad";
		
		String name1[]= new String[4];
		name1[0]="Ram";
		name1[1]="manish";
		name1[2]="Kishore";
		name1[3]="Rajesh";
		
		boolean b1=Arrays.equals(name, name1); // arrays are not equal
		System.out.println(b1);
		
		if(b1==true)
		{
			System.out.println("Arrays are equal");
		}
		else
		{
			System.out.println("Arrays are not equal");
		}
		
		int num1[]=new int[4];

		num1[0]=68;
		num1[1]=35;
		num1[2]=46;
		num1[3]=58;
		
		int num2[]= new int[4];
		num2[0]=68;
		num2[1]=35;
		num2[2]=46;
		num2[3]=58;
		
		boolean b2=Arrays.equals(num1, num2); //Arrays are equal
		System.out.println(b2);
		
		if(b2==true)
		{
			System.out.println("Arrays are equal");
		}
		else
		{
			System.out.println("Arrays are not equal");
		}
		
		
		
		
	}

}
