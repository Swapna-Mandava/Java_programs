package mainmethod;
class class1{
	
	static void addition(int a,int b)
	{
		int sum=a=b;
		System.out.println("The age of the person is--"+sum);
	}
	
	void appointment() 
	{
		System.out.println("The appointment is fixed on Sept 28th");
	}
	
}
class class2 extends class1
{
	
	static void height()
	{
		double a=160.57;
		System.out.println("Height is-- "+a);
	}
	
	 void weight()
	{
		System.out.println("Weight ---78kg");
	}
	
	
}
class class3 extends class2
{
	
	static void visiting()
	{
		System.out.println("Visiting from Udaipur");
	}
	
	 void doctor()
		{
			System.out.println("By Cardiologist");
		}
	
	
}

public class Multilevelinheritance extends class3

{
	static void surgery()
	{
		System.out.println("Surgery on 19th oct");
	}
	
	 void patient()
		{
			System.out.println("Patient - Krishna");
		}
	
	
	
	
	
	public static void main(String[] args)
	{
		
		Multilevelinheritance m1=new Multilevelinheritance();
		m1.patient();
		addition(5,25);
		height();
		m1.weight();
		m1. appointment();
		visiting();
		surgery();
		m1.doctor();
			
		
		
	}

}
