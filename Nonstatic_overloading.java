package mainmethod;

public class Nonstatic_overloading {
	
	void addition(int a,int b)
	
	{int sum=a+b;
	System.out.println("the result for addition is "+sum);
		
	}
	void subtraction(int a, int b) 
	
	{int subtract=a-b;
	
			System.out.println("the result for subraction is "+subtract);
			}
	 void mulitplication(double a, double b)
	 {double multiply=a*b ;
	 
	 System.out.println("the result for multiplication is "+ multiply);
	 
	 }
	 void division(int a, int b) 
		
		{int divide=a/b;
		
				System.out.println("the result for division is "+divide);
				
				}
			
	 void modulus(int a, float b) 
		
		{float modulus=a%b;
		
				System.out.println("the result for modulus is "+modulus);
				
				}
			
	public static void main(String[] args) {
		
		Nonstatic_overloading n1=new Nonstatic_overloading();
		n1.addition(5,6);
		n1.subtraction(65,50);
		n1.mulitplication(025.625, 65.725);
		n1.division(65,5);
		n1.modulus(65,5.5f);
	}
	}

;
