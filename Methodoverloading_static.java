package mainmethod;

public class Methodoverloading_static 
{
	
 
static void addition(double a,double b)
	
	{double sum=a+b;
		 System.out.println(sum);
	}
	static void addition(double a,int b)
	
	{double subtract=a-b;
		 System.out.println(subtract);
		 }
	static void addition(int a, int b)
	
	{int multiply= a*b;
	System.out.println(multiply);
	}
	static void addition(int a, double b)
	
	{double divide= b/a;
	System.out.println(divide);
	}
static void addition(long a, int b)

{long modulus= a/b;
System.out.println(modulus);
}
	public static void main(String[] args) 
	{
		
		addition(45.673,25.651);
		addition(65.754,45);
		addition(45,5.25f);
		addition(45,256.875);
		addition(25000,56);
	}

}
;