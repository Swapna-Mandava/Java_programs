package mainmethod;

class NOnstatic{
	
	void testcase()
	{
		System.out.println("The testcase is positive");
	}
	
	
	
	void testcase1()
	{
		System.out.println("The testcase1 is negative");
	}
	
	
}

public class Nonstatic_singleinheritance extends NOnstatic {
	
	void testcase3()
	{
		System.out.println("The testcase3 has errors");
	}
	
	void testcase4()
	{
		System.out.println("The testcase4 is deployed");
	}
	
	
	public static void main(String[] args) {
		
		Nonstatic_singleinheritance n1= new Nonstatic_singleinheritance();
		
		
		n1.testcase4();
		n1.testcase3();
		n1.testcase();
		n1.testcase1();
	}
}
