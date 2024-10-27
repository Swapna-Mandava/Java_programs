package assignments;

interface testcase2{
	void passed();
	void failed();
	
}

public class Assign52_inheritinterface implements testcase2

{
	public static void main(String[] args) {
		
		Assign52_inheritinterface a1=new Assign52_inheritinterface();
		a1. passed();
		a1.failed();
		
	}


	public void passed() {
		
		System.out.println("The testcase is passed");
	
		
	}


	public void failed() {
	
		System.out.println("The testcase is failed");
	}

}
