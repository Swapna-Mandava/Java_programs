package assignments;
class one{
	
	void add() {
		
		System.out.println("Print the numbers");
	}
}


public class Assign76_upcasting  extends one
{

void sub(){
	
	System.out.println("subtract the numbers");
}

	public static void main(String[] args) {
		
		one o1=new Assign76_upcasting();
		
		 Assign76_upcasting a1= ( Assign76_upcasting) o1;
		
		
		o1.add();
		a1.sub();
	
}

}
