package mainmethod;

public class operators_nonstatic 
{
	void addition()
{
		int a=100;
		int b=200;
		int sum=a+b;
		System.out.println("sum of two numbers is = "+sum);		
	}
	
	void subraction()
{
		int a=520;
		int b=330;
		int subtract=a-b;
		System.out.println("Difference of two numbers is = "+subtract);
		
	} 
	void multiply()
{
		int a=250;
		int b=60;
		int multiply=a*b;
		System.out.println("Multiplication of two numbers is = "+multiply);
		
	} 
	void Division()
{
		byte a=120;
		int b=60;
		int divide=a/b;
		System.out.println("division of two numbers is = "+divide);
		
	} 
	
	void modulus()
{
		int a=25000;
		double b=60.25;
		double modulus=a%b;
		System.out.println("reminder of two numbers is = "+modulus);
		
	} 
	
	
	public static void main(String[] args) {
		operators_nonstatic o1=new operators_nonstatic();
		o1.addition();
		o1.subraction();
		o1.multiply();
		o1.Division();
		o1.modulus();
	}
	
	
	

}
