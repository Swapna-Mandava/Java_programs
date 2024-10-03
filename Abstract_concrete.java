package mainmethod;

class Concrete //concrete methods
{
	void holiday()
	{
		System.out.println("Plan the trip");
	}
	
	void holiday1()
	{
		System.out.println("book the tickets");
	}
}

abstract class abstract1 extends Concrete // two concrete methods and two abstract methods
{
	abstract void hotel();
	abstract void movie();
	
	void picnic() {
		System.out.println("go for pickpic on weekends");
	}
	
	void exhibition() {
		
		System.out.println("go for exhibition on Friday");
	}
}


public class Abstract_concrete extends abstract1 //two concrete methods

{
	void office() {
		
		System.out.println("go to office for 3 days");
		
	}
	
	void Parttime() {
		System.out.println("Plan in the evening");
		
	}
public static void main(String[] args) {
	
	
	 Abstract_concrete a1=new  Abstract_concrete();
	 a1.holiday();
	 a1.holiday1();
	 a1.office();
	 a1.Parttime();
	 a1.exhibition();
	 a1.picnic();
}
}
