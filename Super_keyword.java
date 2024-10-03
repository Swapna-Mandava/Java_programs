package mainmethod;

class travel{
	void booking() {
		System.out.println("book the tickets with make my trip");
	}
}

public class Super_keyword extends travel

{
	
void booking() {
	
	System.out.println("To get discounts on all flight tickets");
		super.booking();
	}
	public static void main(String[] args) {
		
		Super_keyword s1=new Super_keyword ();
s1.booking();
 
	}

}
