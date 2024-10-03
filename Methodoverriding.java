package mainmethod;

class two{
	
		
		void testing()
		{
			System.out.println("Write the test cases");
		}
		
		
}

public class Methodoverriding {
	
	void testing()
	{
		System.out.println("Testing is done and code is deployed to prod");
	}
	
	public static void main(String[] args) {
		
		Methodoverriding m1=new Methodoverriding();
		m1.testing();
		
	}

}
