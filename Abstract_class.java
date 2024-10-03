package mainmethod;
abstract class Hospital 

{
	abstract void medicine();//abstract methods
	abstract void pharmacy();
	
}

public class Abstract_class //
{
	
	void medicine() //concrete methods
	{
		System.out.println("Take doctor appointment before taking medicines");
	}
	
	void pharmacy()
	{
		System.out.println("Pay bills using credit card");
	}
	public static void main(String[] args) {
		
		Abstract_class a1=new Abstract_class();
		a1.medicine();
		a1.pharmacy();
		
		
		
	}

}
