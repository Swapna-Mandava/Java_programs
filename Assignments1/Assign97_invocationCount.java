package testng_assignments;

import org.testng.annotations.Test;

public class Assign97_invocationCount 
{
	@Test(invocationCount=5)
	public void add() 
	{
		System.out.println("Hello");
		
	}

}
