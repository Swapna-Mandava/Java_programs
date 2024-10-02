package mainmethod;

public class thiscallingstatement
{
	thiscallingstatement()
	{
		this("arun",30);
		System.out.println("Name of the bank is SBI");
	}
	
	thiscallingstatement(int a)
	{
	this();
		System.out.println("acount number is"+a);
	}
	
	thiscallingstatement(String b, int c)
	
	
	{
		
		this(true);
		System.out.println("Accound holder name is-- " +b +"--Age is "+ c);
	}
	
	thiscallingstatement(boolean b)
	
	{
	
		System.out.println("Is acount existing  --- "+b);
	}
	
	
	public static void main(String[] args) {
		
		new thiscallingstatement();
	
}
}
