package assignments;
interface amazon {
	void login();
	}

class flipkart {
	
	void offers() {
		System.out.println("We have offer for diwali on Filpkart");
	}
}


public class Assign53_implementsextends extends flipkart implements amazon
{
	public static void main(String[] args) {
		
		Assign53_implementsextends a1=new Assign53_implementsextends();
		a1.offers();
		a1.login();
		
		
		
		
	}




	@Override
	public void login() {
	System.out.println("Sign up with gmail");
		
	}

}
